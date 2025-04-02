package com.teste.seguranca.domain.service;

import com.teste.seguranca.api.model.dto.UsuarioInput;
import com.teste.seguranca.domain.entity.usuario.Usuario;
import com.teste.seguranca.domain.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario save(Usuario newUsuario) {
        return usuarioRepository.save(newUsuario);
    }

}
