package com.sismed.sismed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AgendaController {
    @RequestMapping("/agendaPage")
    public String index () {
        return "agenda/index";
    }
}
