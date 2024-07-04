package com.sismed.sismed.controller;

import com.sismed.sismed.model.User;
import com.sismed.sismed.repository.UserRepository;
import com.sismed.sismed.security.CookieService;
import com.sismed.sismed.security.TokenService;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class AuthenticationController {

    @Autowired
    AuthenticationManager authenticationManager;
    @Autowired
    UserRepository userRepository;
    @Autowired
    TokenService tokenService;

    public User getUsuarioLogado() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Object principal = authentication.getPrincipal();
        User user = (User) principal;

        return user;
    }

    @PostMapping("/login")
    public ModelAndView login(@Valid User user, HttpServletResponse httpServletResponse) {
        var usernamePassword = new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword());
        var auth = authenticationManager.authenticate(usernamePassword);
        var token = tokenService.generateToken((User) auth.getPrincipal());

        // 31 para expirar
        int tempoExpiracao = 31*24*60*60;

        CookieService.setCookie(httpServletResponse, "token", token, tempoExpiracao);
//        return ResponseEntity.ok().build();
        return new ModelAndView("redirect:/");
    }

    @PostMapping("/register")
    public ResponseEntity cadastro(@RequestBody @Valid User user) {
        if (this.userRepository.findByLogin(user.getUsername()) != null) return ResponseEntity.badRequest().build();

        String passwordEncriptado = new BCryptPasswordEncoder().encode(user.getPassword());
        user.setPassword(passwordEncriptado);
        this.userRepository.save(user);

        return ResponseEntity.ok().build();
    }

    @GetMapping("/deslogar")
    public ModelAndView logout(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {

        Cookie cookie = CookieService.getCookie(httpServletRequest, "token");
        if (cookie != null) {
            CookieService.removeCookie(httpServletResponse, cookie);
        }

        return new ModelAndView("redirect:/loginPage");
    }
}
