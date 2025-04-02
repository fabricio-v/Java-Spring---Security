package com.teste.seguranca.domain.entity.usuario;

public enum RoleUsuario {

    ADMIN("admin"),
    USER("user");

    private final String role;

    RoleUsuario(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

}
