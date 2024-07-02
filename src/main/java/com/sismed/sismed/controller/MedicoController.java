package com.sismed.sismed.controller;

import com.sismed.sismed.model.Medico;
import com.sismed.sismed.repository.MedicoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class MedicoController {

    @Autowired
    MedicoRepository medicoRepository;

    @PostMapping("/cadastraMedico")
    public ResponseEntity cadastrarMedico(@Valid Medico medico) {

        medico = this.medicoRepository.save(medico);

        return ResponseEntity.ok(medico);
    }

    @PostMapping("/listaMedicos")
    public ResponseEntity listarMedicos() {

        List<Medico> medicos = this.medicoRepository.findAll();

        return ResponseEntity.ok(medicos);
    }

    public Optional<Medico> getMedico(@Valid Long id) {
        return medicoRepository.findById(id);
    }
}
