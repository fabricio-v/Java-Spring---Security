package com.teste.seguranca.api.model.dto;

import com.teste.seguranca.domain.entity.Categoria;
import jakarta.validation.constraints.NotEmpty;

import java.util.UUID;

/**
 * DTO for {@link Categoria}
 */
public record CategoriaInput(UUID id, @NotEmpty String nome) {

    public Categoria toEntity() {
        Categoria categoria = new Categoria();
        categoria.setId(this.id);
        categoria.setNome(this.nome);
        return categoria;
    }

}