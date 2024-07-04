package com.sismed.sismed.util;

import com.sismed.sismed.model.Medico;
import com.sismed.sismed.model.Paciente;

import java.util.List;

public class NovoAtendimentoDTO {
    private List<Paciente> pacientes;
    private List<Medico> medicos;

    public NovoAtendimentoDTO(List<Paciente> pacientes, List<Medico> medicos) {
        this.pacientes = pacientes;
        this.medicos = medicos;
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public List<Medico> getMedicos() {
        return medicos;
    }

    public void setMedicos(List<Medico> medicos) {
        this.medicos = medicos;
    }

    @Override
    public String toString() {
        return "NovoAtendimentoDTO{" +
                "pacientes=" + pacientes +
                ", medicos=" + medicos +
                '}';
    }
}
