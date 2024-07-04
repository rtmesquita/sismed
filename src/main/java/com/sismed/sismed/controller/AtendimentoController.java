package com.sismed.sismed.controller;

import com.sismed.sismed.model.Atendimento;
import com.sismed.sismed.model.Medico;
import com.sismed.sismed.model.Paciente;
import com.sismed.sismed.repository.AtendimentoRepository;
import com.sismed.sismed.repository.MedicoRepository;
import com.sismed.sismed.repository.PacienteRepository;
import com.sismed.sismed.util.AtendimentoDTO;
import com.sismed.sismed.util.HeaderDTO;
import com.sismed.sismed.util.NovoAtendimentoDTO;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/atendimento")
public class AtendimentoController {

    @Autowired
    AtendimentoRepository atendimentoRepository;
    @Autowired
    MedicoRepository medicoRepository;
    @Autowired
    PacienteRepository pacienteRepository;

    @Autowired
    AuthenticationController authenticationController;

    // Visualização
    @RequestMapping("/visualizarPage")
    public ModelAndView visualizarAtendimentosPage() {

        List<Atendimento> atendimentos = atendimentoRepository.findAll();

        return new ModelAndView("atendimento/listar")
                .addObject("atendimentos", atendimentos)
                .addObject("pacientes", pacienteRepository.findAll())
                .addObject("medicos", medicoRepository.findAll())
                .addObject("user", new HeaderDTO(authenticationController.getUsuarioLogado()));
    }
    public ModelAndView visualizarAtendimentoPage(Atendimento atendimento) {
        return new ModelAndView("atendimento/visualizacao")
                .addObject("atendimento", atendimento)
                .addObject("user", new HeaderDTO(authenticationController.getUsuarioLogado()));
    }


    // Cadastro
    @RequestMapping("/cadastrarPage")
    public ModelAndView cadastrarAtendimentoPage () {

        List<Paciente> pacientes = pacienteRepository.findAll();
        List<Medico> medicos = medicoRepository.findAll();

        NovoAtendimentoDTO novoAtendimentoDTO
                = new NovoAtendimentoDTO(pacientes, medicos);

        return new ModelAndView("atendimento/cadastro")
                .addObject("atendimentoDTO", novoAtendimentoDTO)
                .addObject("user", new HeaderDTO(authenticationController.getUsuarioLogado()));
    }
    @PostMapping("/cadastrar")
    public ModelAndView cadastrarAtendimento(@Valid AtendimentoDTO atendimentoDTO) {

        Optional<Paciente> paciente = pacienteRepository.findById(atendimentoDTO.getIdPaciente());
        Optional<Medico> medico = medicoRepository.findById(atendimentoDTO.getIdMedico());

        Atendimento atendimento = new Atendimento(paciente.get(), medico.get(), atendimentoDTO);

//        atendimento = atendimentoRepository.save(atendimento);

        return visualizarAtendimentoPage(atendimento);
    }
}
