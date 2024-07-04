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

import java.time.LocalDate;
import java.util.ArrayList;
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
        return new ModelAndView("atendimento/medicos")
                .addObject("medicos", medicoRepository.findAll())
                .addObject("user", new HeaderDTO(authenticationController.getUsuarioLogado()));
    }

    @PostMapping("/receberMedico")
    public ModelAndView receberMedico(Long id) {

        List<Object[]> objetos = atendimentoRepository.findAllPacientesByMedicoId(id);
        List<Paciente> pacientes = new ArrayList<>();

        for (Object[] row : objetos) {
            Paciente paciente = new Paciente();
            paciente.setId((Long) row[0]);
            paciente.setNome((String) row[1]);
            paciente.setSexo((Character) row[2]);
            paciente.setDataNascimento((LocalDate) row[3]);
            pacientes.add(paciente);
        }

        return new ModelAndView("atendimento/pacientes")
                .addObject("pacientes", pacientes)
                .addObject("user", new HeaderDTO(authenticationController.getUsuarioLogado()));
    }

    @PostMapping("/receberPaciente")
    public ModelAndView receberPaciente(Long id) {

        List<Atendimento> atendimentos = atendimentoRepository.findAllByPaciente_Id(id);

        return new ModelAndView("atendimento/datas")
                .addObject("atendimentos", atendimentos)
                .addObject("user", new HeaderDTO(authenticationController.getUsuarioLogado()));
    }

    @PostMapping("/receberData")
    public ModelAndView receberData(Long id) {
        return visualizarAtendimentoPage(atendimentoRepository.findById(id).get());
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

        atendimento = atendimentoRepository.save(atendimento);

        return visualizarAtendimentoPage(atendimento);
    }
}
