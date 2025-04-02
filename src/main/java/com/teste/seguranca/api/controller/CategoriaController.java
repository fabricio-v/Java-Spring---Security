package com.teste.seguranca.api.controller;

import com.teste.seguranca.api.model.response.CategoriaResponse;
import com.teste.seguranca.domain.service.CategoriaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/categorias")
public class CategoriaController {

    private final CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @GetMapping
    public List<CategoriaResponse> save() {
        return CategoriaResponse.toCollectionModel(categoriaService.findAll());
    }

}
