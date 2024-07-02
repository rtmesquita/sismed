package com.sismed.sismed.controller.util;


import com.sismed.sismed.model.Anamnese;
import com.sismed.sismed.model.Medico;
import com.sismed.sismed.model.Paciente;

public class AnamneseDTO {
    private long id;
    private Paciente paciente;
    private Medico medico;
    private String queixa;
    private String historia;
    private Boolean tratamentoMedico;
    private String alergia;
    private Boolean cirurgia;
    private Boolean gestante;
    private Boolean fumante;

    public AnamneseDTO(Anamnese anamnese, Medico medico, Paciente paciente) {
        this.id = anamnese.getId();
        this.queixa = anamnese.getQueixa();
        this.historia = anamnese.getHistoria();
        this.tratamentoMedico = anamnese.getTratamentoMedico();
        this.alergia = anamnese.getAlergia();
        this.cirurgia = anamnese.getCirurgia();
        this.gestante = anamnese.getGestante();
        this.fumante = anamnese.getFumante();

        this.medico = medico;
        this.paciente = paciente;
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

    @Override
    public String toString() {
        return "AnamneseDTO{" +
                "id=" + id +
                ", paciente=" + paciente +
                ", medico=" + medico +
                ", queixa='" + queixa + '\'' +
                ", historia='" + historia + '\'' +
                ", tratamentoMedico=" + tratamentoMedico +
                ", alergia='" + alergia + '\'' +
                ", cirurgia=" + cirurgia +
                ", gestante=" + gestante +
                ", fumante=" + fumante +
                '}';
    }
}
