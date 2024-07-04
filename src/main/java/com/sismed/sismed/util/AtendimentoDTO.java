package com.sismed.sismed.util;

import com.sismed.sismed.model.Atendimento;

public class AtendimentoDTO {

    private Long idPaciente;
    private Long idMedico;
    private String queixa;
    private String historia;
    private Boolean tratamentoMedico;
    private String alergia;
    private Boolean cirurgia;
    private Boolean gestante;
    private Boolean fumante;

    public Long getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Long idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Long getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Long idMedico) {
        this.idMedico = idMedico;
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
        return "AtendimentoDTO{" +
                "idPaciente=" + idPaciente +
                ", idMedico=" + idMedico +
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