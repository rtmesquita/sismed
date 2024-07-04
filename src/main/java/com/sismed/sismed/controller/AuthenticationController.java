package com.sismed.sismed.controller;

import com.sismed.sismed.model.User;
import com.sismed.sismed.repository.UserRepository;
import com.sismed.sismed.security.CookieService;
import com.sismed.sismed.security.TokenService;
import com.sismed.sismed.util.HeaderDTO;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
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

    // Log
    @RequestMapping("/logarPage")
    public ModelAndView index () {
        return new ModelAndView("login/index");
    }
    @PostMapping("/logar")
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

    @GetMapping("/deslogar")
    public ModelAndView logout(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {

        Cookie cookie = CookieService.getCookie(httpServletRequest, "token");
        if (cookie != null) {
            CookieService.removeCookie(httpServletResponse, cookie);
        }

        return new ModelAndView("redirect:/logarPage");
    }

    // Cadastrar
    @RequestMapping("/usuario/cadastrarPage")
    public ModelAndView cadastro (){
        return new ModelAndView( "login/cadastro")
                .addObject("user", new HeaderDTO(getUsuarioLogado()));
    }

    @RequestMapping("/usuario/visualizarPage")
    public ModelAndView visualizarUsuariosPage (){
        return new ModelAndView( "login/listar")
                .addObject("users", userRepository.findAll());
    }

    @PostMapping("/usuario/cadastrar")
    public ModelAndView cadastrarUsuario(@Valid User user) {

        String passwordEncriptado = new BCryptPasswordEncoder().encode(user.getPassword());
        user.setPassword(passwordEncriptado);
        this.userRepository.save(user);

        return new ModelAndView("redirect:/");
    }

    @PostMapping("/usuario/remover")
    public ModelAndView removerUsuario(@Valid Long id) {

        this.userRepository.deleteById(id);

        return new ModelAndView("redirect:/");
    }
}
