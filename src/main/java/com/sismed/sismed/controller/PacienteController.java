package com.sismed.sismed.controller;

import com.sismed.sismed.model.Paciente;
import com.sismed.sismed.repository.PacienteRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

public class PacienteController {

    @Autowired
    PacienteRepository pacienteRepository;

    @PostMapping("/cadastraPaciente")
    public ResponseEntity cadastrarPaciente(@Valid Paciente paciente) {

        paciente = this.pacienteRepository.save(paciente);

        return ResponseEntity.ok(paciente);
    }

    @PostMapping("/listaPacientes")
    public ResponseEntity listarPacientes() {

        List<Paciente> pacientes = this.pacienteRepository.findAll();

        return ResponseEntity.ok(pacientes);
    }

    public Optional<Paciente> getPaciente(@Valid Long id) {
        return pacienteRepository.findById(id);
    }
}
