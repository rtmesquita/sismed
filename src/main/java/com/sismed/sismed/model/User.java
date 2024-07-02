package com.sismed.sismed.model;

import com.sismed.sismed.util.UserRole;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "usuario")
// Vinculando o Usuario como User de autenticação: interface UserDetails
public class User implements UserDetails {
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

    // Métodos da Interface UserDetails para gerenciamento do Spring Security
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        if (role.equals("ADMIN")) return List.of(new SimpleGrantedAuthority("ROLE_ADMIN"), new SimpleGrantedAuthority("ROLE_MEDICO"));
        else if (role.equals("MEDICO")) return List.of(new SimpleGrantedAuthority("ROLE_MEDICO"));
        else return null;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return login;
    }

    @Override
    public boolean isAccountNonExpired() {
        return UserDetails.super.isAccountNonExpired();
    }

    @Override
    public boolean isAccountNonLocked() {
        return UserDetails.super.isAccountNonLocked();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return UserDetails.super.isCredentialsNonExpired();
    }

    @Override
    public boolean isEnabled() {
        return UserDetails.super.isEnabled();
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
