package com.sismed.sismed.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "anamnese")
public class Anamnese {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "id_paciente")
    private long idPaciente;
    @Column(name = "id_medico")
    private long idMedico;
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

    public Anamnese() {}

    public Anamnese(long idPaciente, long idMedico, String queixa, String historia, Boolean tratamentoMedico, String alergia, Boolean cirurgia, Boolean gestante, Boolean fumante) {
        this.idPaciente = idPaciente;
        this.idMedico = idMedico;
        this.queixa = queixa;
        this.historia = historia;
        this.tratamentoMedico = tratamentoMedico;
        this.alergia = alergia;
        this.cirurgia = cirurgia;
        this.gestante = gestante;
        this.fumante = fumante;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(long idPaciente) {
        this.idPaciente = idPaciente;
    }

    public long getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(long idMedico) {
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
        return "Anamnese{" +
                "id=" + id +
                ", idPaciente=" + idPaciente +
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