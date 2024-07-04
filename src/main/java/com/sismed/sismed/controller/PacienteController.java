package com.sismed.sismed.controller;

import com.sismed.sismed.model.Paciente;
import com.sismed.sismed.repository.PacienteRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/paciente")
public class PacienteController {

    @Autowired
    PacienteRepository pacienteRepository;

    @RequestMapping("/cadastrarPage")
    public ModelAndView cadastrarPacientePage() {


        return new ModelAndView("novoCadastro/paciente");
    }
    @PostMapping("/cadastrar")
    public ModelAndView cadastrarPaciente(@Valid Paciente paciente) {

        this.pacienteRepository.save(paciente);

        return new ModelAndView("redirect:/paciente/listarPage");
    }

    @RequestMapping("/listarPage")
    public ModelAndView visualizarPacientes() {

        List<Paciente> pacientes = this.pacienteRepository.findAll();

        return new ModelAndView("novoCadastro/listarPacientes")
                .addObject("pacientes", pacientes);
    }

    public Optional<Paciente> getPaciente(@Valid Long id) {
        return pacienteRepository.findById(id);
    }
}
