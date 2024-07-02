package com.sismed.sismed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class LoginController {
    @RequestMapping("/loginPage")
    public String index () {
        return "login/index";
    }

    @RequestMapping("/cadastroPage")
    public String cadastro (){
        return "login/cadastro";
    }
}

