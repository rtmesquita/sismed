package com.sismed.sismed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    @RequestMapping("/login")
    public String index () {
        return "login/index";
    }

    @RequestMapping("/login/cadastro")
    public String cadastro (){
        return "login/cadastro";
    }
}

