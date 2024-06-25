package com.sismed.sismed.util;

public enum UserRole {
    SECRETARIO("secretario"),
    MEDICO("medico");

    private String role;

    UserRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
