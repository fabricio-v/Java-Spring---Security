package com.teste.seguranca.domain.service;

import com.teste.seguranca.domain.entity.Categoria;
import com.teste.seguranca.domain.repository.CategoriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    private final CategoriaRepository categoriaRepository;

    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    public List<Categoria> findAll(){
        return categoriaRepository.findAll();
    }

}
