package com.sismed.sismed.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "medico")
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Size(max = 100)
    private String nome;

    @Size(max = 20)
    private String crm;

    @Size(max = 50)
    private String especialidade;

    public Medico() {}

    public Medico(String nome, String crm, String especialidade) {
        this.nome = nome;
        this.crm = crm;
        this.especialidade = especialidade;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", crm='" + crm + '\'' +
                ", especialidade='" + especialidade + '\'' +
                '}';
    }
}
