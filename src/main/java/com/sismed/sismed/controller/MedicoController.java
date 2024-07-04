package com.sismed.sismed.controller;

import com.sismed.sismed.model.Medico;
import com.sismed.sismed.repository.MedicoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/medico")
public class MedicoController {

    @Autowired
    MedicoRepository medicoRepository;

    @RequestMapping("/cadastrarPage")
    public ModelAndView cadastrarMedicoPage() {

        return new ModelAndView("novoCadastro/medico");
    }
    @PostMapping("/cadastrar")
    public ModelAndView cadastrarMedico(@Valid Medico medico) {

        this.medicoRepository.save(medico);

        return new ModelAndView("redirect:/medico/listarPage");
    }

    @RequestMapping("/listarPage")
    public ModelAndView visualizarMedicos() {

        List<Medico> medicos = this.medicoRepository.findAll();

        return new ModelAndView("novoCadastro/listarMedicos")
                .addObject("medicos", medicos);
    }

    public Optional<Medico> getMedico(@Valid Long id) {
        return medicoRepository.findById(id);
    }
}
