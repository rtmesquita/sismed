package com.sismed.sismed.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import java.util.Date;

@Entity
@Table(name = "paciente")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Size(max = 100)
    private String nome;
    private Character sexo;
    @Column(name = "data_nascimento")
    private Date dataNascimento;

    public Paciente() {}

    public Paciente(String nome, Character sexo, Date dataNascimento) {
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
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

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sexo=" + sexo +
                ", dataNascimento=" + dataNascimento +
                '}';
    }
}
