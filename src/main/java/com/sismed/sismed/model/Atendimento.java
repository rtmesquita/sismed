package com.sismed.sismed.model;

import com.sismed.sismed.util.AtendimentoDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import java.time.*;


@Entity
@Table(name = "atendimento")
public class Atendimento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name = "id_paciente")
    private Paciente paciente;
    @ManyToOne
    @JoinColumn(name = "id_medico")
    private Medico medico;
    @Size(max = 300)
    private String queixa;
    @Size(max = 1000)
    private String historia;
    @Column(name = "tratamento_medico")
    private Boolean tratamentoMedico;
    @Size(max = 100)
    private String alergia;
    private Boolean cirurgia;
    private Boolean gestante;
    private Boolean fumante;
    @Column(name = "data_atendimento")
    private LocalDate dataAtendimento;

    public Atendimento() {}

    public Atendimento(Paciente paciente, Medico medico, AtendimentoDTO atendimentoDTO) {
        this.paciente = paciente;
        this.medico = medico;
        this.queixa = atendimentoDTO.getQueixa();
        this.historia = atendimentoDTO.getHistoria();
        this.tratamentoMedico = atendimentoDTO.getTratamentoMedico();
        this.alergia = atendimentoDTO.getAlergia();
        this.cirurgia = atendimentoDTO.getCirurgia();
        this.gestante = atendimentoDTO.getGestante();
        this.fumante = atendimentoDTO.getFumante();
        this.dataAtendimento = LocalDate.now();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getQueixa() {
        return queixa;
    }

    public void setQueixa(String queixa) {
        this.queixa = queixa;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public Boolean getTratamentoMedico() {
        return tratamentoMedico;
    }

    public void setTratamentoMedico(Boolean tratamentoMedico) {
        this.tratamentoMedico = tratamentoMedico;
    }

    public String getAlergia() {
        return alergia;
    }

    public void setAlergia(String alergia) {
        this.alergia = alergia;
    }

    public Boolean getCirurgia() {
        return cirurgia;
    }

    public void setCirurgia(Boolean cirurgia) {
        this.cirurgia = cirurgia;
    }

    public Boolean getGestante() {
        return gestante;
    }

    public void setGestante(Boolean gestante) {
        this.gestante = gestante;
    }

    public Boolean getFumante() {
        return fumante;
    }

    public void setFumante(Boolean fumante) {
        this.fumante = fumante;
    }

    public LocalDate getDataAtendimento() {
        return dataAtendimento;
    }

    public void setDataAtendimento(LocalDate dataAtendimento) {
        this.dataAtendimento = dataAtendimento;
    }

    @Override
    public String toString() {
        return "Atendimento{" +
                "id=" + id +
                ", Paciente=" + paciente +
                ", Medico=" + medico +
                ", queixa='" + queixa + '\'' +
                ", historia='" + historia + '\'' +
                ", tratamentoMedico=" + tratamentoMedico +
                ", alergia='" + alergia + '\'' +
                ", cirurgia=" + cirurgia +
                ", gestante=" + gestante +
                ", fumante=" + fumante +
                ", dataCadastro=" + dataAtendimento +
                '}';
    }
}