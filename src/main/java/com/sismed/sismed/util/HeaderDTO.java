package com.sismed.sismed.util;

import com.sismed.sismed.model.User;

public class HeaderDTO {
    public String nome;
    public String isUsuario;
    public String isMedico;
    public String isAdmin;

    public HeaderDTO(User user) {
        this.nome = user.getNome();

        this.isUsuario = "1";
        this.isMedico = "0";
        this.isAdmin = "0";
        if (user.getRole() != null && user.getRole().equals("MEDICO")) {
            this.isUsuario = "0";
            this.isMedico = "1";
            this.isAdmin = "0";
        } else if (user.getRole() != null && user.getRole().equals("ADMIN")) {
            this.isUsuario = "1";
            this.isMedico = "1";
            this.isAdmin = "1";
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIsUsuario() {
        return isUsuario;
    }

    public void setIsUsuario(String isUsuario) {
        this.isUsuario = isUsuario;
    }

    public String getIsMedico() {
        return isMedico;
    }

    public void setIsMedico(String isMedico) {
        this.isMedico = isMedico;
    }

    public String getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(String isAdmin) {
        this.isAdmin = isAdmin;
    }

    @Override
    public String toString() {
        return "HeaderDTO{" +
                "nome='" + nome + '\'' +
                ", isUsuario=" + isUsuario +
                ", isMedico=" + isMedico +
                ", isAdmin=" + isAdmin +
                '}';
    }
}
