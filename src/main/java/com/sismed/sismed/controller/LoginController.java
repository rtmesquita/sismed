package com.sismed.sismed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {
    @RequestMapping("")
    public String index () {
        return "login/index";
    }

    @RequestMapping("/cadastro")
    public String cadastro (){
        return "login/cadastro";
    }
}

