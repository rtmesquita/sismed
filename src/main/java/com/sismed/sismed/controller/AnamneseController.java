package com.sismed.sismed.controller;

import com.sismed.sismed.model.Anamnese;
import com.sismed.sismed.repository.AnamneseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AnamneseController {

    @Autowired
    AnamneseRepository anamneseRepository;

    @RequestMapping("/anamnese")
    public String index () {
        return "anamnese/index";
    }

    @PostMapping("/listaAnamneses")
    public ResponseEntity listarAnamneses() {

        List<Anamnese> anamneses = anamneseRepository.findAll();

        return ResponseEntity.ok(anamneses);
    }
}
