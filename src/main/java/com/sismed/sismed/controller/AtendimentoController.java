package com.sismed.sismed.controller;

import com.sismed.sismed.model.Atendimento;
import com.sismed.sismed.repository.AtendimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AtendimentoController {

    @Autowired
    AtendimentoRepository atendimentoRepository;

    @RequestMapping("/atendimentoPage")
    public String index () {
        return "atendimento/index";
    }

    @RequestMapping("/atendimento/visualizacao")
    public String visualizacao () {
        return "atendimento/visualizacao";
    }

    @PostMapping("/listaAtendimentos")
    public ResponseEntity listarAtendimento() {

        List<Atendimento> atendimentos = atendimentoRepository.findAll();

        return ResponseEntity.ok(atendimentos);
    }
}
