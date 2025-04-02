package com.teste.seguranca.api.model.dto;

import com.teste.seguranca.domain.entity.usuario.RoleUsuario;
import com.teste.seguranca.domain.entity.usuario.Usuario;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * DTO for {@link Usuario}
 */
public record UsuarioInput(String nome, String email, String senha, RoleUsuario role) {

    public Usuario toEntity() {
        Usuario usuario = new Usuario();
        usuario.setNome(nome);
        usuario.setEmail(email);
        usuario.setSenha(new BCryptPasswordEncoder().encode(senha));
        usuario.setRole(role);
        return usuario;
    }


}