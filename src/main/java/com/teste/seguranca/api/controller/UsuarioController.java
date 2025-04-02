package com.teste.seguranca.api.controller;

import com.teste.seguranca.api.model.dto.UsuarioInput;
import com.teste.seguranca.api.model.response.UsuarioResponse;
import com.teste.seguranca.domain.service.UsuarioService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public UsuarioResponse save(@RequestBody UsuarioInput usuarioInput) {
        return UsuarioResponse.toModel(usuarioService.save(usuarioInput.toEntity()));
    }

}
