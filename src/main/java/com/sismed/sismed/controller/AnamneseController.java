package com.sismed.sismed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AnamneseController {
    @RequestMapping("/anamnese")
    public String index () {
        return "anamnese/index";
    }
}
