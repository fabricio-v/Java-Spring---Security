package com.teste.seguranca.api.model.response;

import com.teste.seguranca.domain.entity.Categoria;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * DTO for {@link Categoria}
 */
public record CategoriaResponse(UUID id, String nome) {

    public static CategoriaResponse toModel(com.teste.seguranca.domain.entity.Categoria categoria) {
        return new CategoriaResponse(categoria.getId(), categoria.getNome());
    }

    public static List<CategoriaResponse> toCollectionModel(List<Categoria> categorias) {
        return categorias.stream()
                .map(CategoriaResponse::toModel)
                .collect(Collectors.toList());
    }

}