package com.sismed.sismed.controller;

import com.sismed.sismed.model.User;
import com.sismed.sismed.repository.UserRepository;
import com.sismed.sismed.security.CookieService;
import com.sismed.sismed.security.TokenService;
import com.sismed.sismed.util.AuthenticationDTO;
import com.sismed.sismed.util.LoginResponseDTO;
import com.sismed.sismed.util.RegisterDTO;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public ResponseEntity login(@RequestBody @Valid AuthenticationDTO data, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        var usernamePassword = new UsernamePasswordAuthenticationToken(data.login(), data.password());
        var auth = authenticationManager.authenticate(usernamePassword);
        var token = tokenService.generateToken((User) auth.getPrincipal());

        return ResponseEntity.ok(new LoginResponseDTO(token));
    }

    @PostMapping("/register")
    public ResponseEntity cadastro(@RequestBody @Valid RegisterDTO data) {
        if (this.userRepository.findByLogin(data.login()) != null) return ResponseEntity.badRequest().build();

        String passwordEncriptado = new BCryptPasswordEncoder().encode(data.password());

        User user = new User(data.login(), data.password(), data.role());
        user.setPassword(passwordEncriptado);

        this.userRepository.save(user);

        return ResponseEntity.ok().build();
    }
}
