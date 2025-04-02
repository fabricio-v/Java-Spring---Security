package com.teste.seguranca.api.model.response;

import com.teste.seguranca.domain.entity.usuario.Usuario;

import java.util.List;
import java.util.UUID;

/**
 * DTO for {@link Usuario}
 */
public record UsuarioResponse(UUID id, String nome, String email, String senha) {

    public static UsuarioResponse toModel(Usuario usuario) {
        return new UsuarioResponse(usuario.getId(), usuario.getNome(), usuario.getEmail(), usuario.getSenha());
    }

    public static List<UsuarioResponse> toModel(List<Usuario> usuarios) {
        return usuarios.stream()
                .map(UsuarioResponse::toModel)
                .toList();
    }
}