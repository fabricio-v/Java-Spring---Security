package com.teste.seguranca.api.controller;

import com.teste.seguranca.api.model.dto.CategoriaInput;
import com.teste.seguranca.api.model.response.CategoriaResponse;
import com.teste.seguranca.domain.service.CategoriaService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/categorias")
public class CategoriaController {

    private final CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @PostMapping
    public CategoriaResponse save(@RequestBody @Valid CategoriaInput input) {
        return CategoriaResponse.toModel(categoriaService.save(input.toEntity()));
    }

    @GetMapping
    public List<CategoriaResponse> findAll() {
        return CategoriaResponse.toCollectionModel(categoriaService.findAll());
    }

}
