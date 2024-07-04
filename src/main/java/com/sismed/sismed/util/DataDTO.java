package com.sismed.sismed.util;

import java.time.LocalDate;

public class DataDTO {
    private Long idAtendimento;
    private LocalDate dataAtendimento;

    public DataDTO(Long idAtendimento, LocalDate dataAtendimento) {
        this.idAtendimento = idAtendimento;
        this.dataAtendimento = dataAtendimento;
    }

    public Long getIdAtendimento() {
        return idAtendimento;
    }

    public void setIdAtendimento(Long idAtendimento) {
        this.idAtendimento = idAtendimento;
    }

    public LocalDate getDataAtendimento() {
        return dataAtendimento;
    }

    public void setDataAtendimento(LocalDate dataAtendimento) {
        this.dataAtendimento = dataAtendimento;
    }

    @Override
    public String toString() {
        return "DataDTO{" +
                "idAtendimento=" + idAtendimento +
                ", dataAtendimento=" + dataAtendimento +
                '}';
    }
}
