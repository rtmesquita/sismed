package com.sismed.sismed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NovoCadastroController {
    @RequestMapping("/novoCadastro/paciente")
    public String paciente () {
        return "novoCadastro/paciente";
    }

    @RequestMapping("/novoCadastro/medico")
    public String medico () {
        return "novoCadastro/medico";
    }
}
