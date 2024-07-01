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
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {

    @Autowired
    AuthenticationManager authenticationManager;
    @Autowired
    UserRepository userRepository;
    @Autowired
    TokenService tokenService;

    @PostMapping("/login")
    public String login(@Valid User user, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        var usernamePassword = new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword());
        var auth = authenticationManager.authenticate(usernamePassword);
        var token = tokenService.generateToken((User) auth.getPrincipal());

        // 31 para expirar
        int tempoExpiracao = 31*24*60*60;
        Cookie cookie = CookieService.getCookie(httpServletRequest, "token");
        if (cookie == null) {
            CookieService.setCookie(httpServletResponse, "token", token, tempoExpiracao);
        } else {
            CookieService.updateCookie(httpServletResponse, cookie, token, tempoExpiracao);

        }

        return "home/index";
    }

    @PostMapping("/register")
    public ResponseEntity cadastro(@Valid User user) {
        if (this.userRepository.findByLogin(user.getUsername()) != null) return ResponseEntity.badRequest().build();

        String passwordEncriptado = new BCryptPasswordEncoder().encode(user.getPassword());
        user.setPassword(passwordEncriptado);
        this.userRepository.save(user);

        return ResponseEntity.ok().build();
    }

    @GetMapping("/logout")
    public ResponseEntity logout(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        Cookie cookie = CookieService.getCookie(httpServletRequest, "token");
        if (cookie != null) {
            CookieService.removeCookie(httpServletResponse, cookie);
        }

        return ResponseEntity.ok().build();
    }
}
