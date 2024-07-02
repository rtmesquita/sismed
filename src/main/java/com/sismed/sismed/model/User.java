package com.sismed.sismed.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "usuario")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Size(max = 100)
    private String login;
    @Size(max = 100)
    private String password;
    @Size(max = 20)
    private String role;

    public User() {

    }
    public User(String login, String password, String role) {
        this.login = login;
        this.password = password;
        this.role = role;
    }

    // Setters
    public void setPassword(String password) {
        this.password = password;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login=" + login +
                ", password=" + password +
                ", role=" + role +
                '}';
    }
}