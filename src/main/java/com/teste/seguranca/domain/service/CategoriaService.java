package com.teste.seguranca.domain.service;

import com.teste.seguranca.domain.entity.Categoria;
import com.teste.seguranca.domain.repository.CategoriaRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    private final CategoriaRepository categoriaRepository;

    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    public Categoria save(Categoria newCategoria) {
        if (newCategoria.getId() != null) {
            return this.update(newCategoria);
        }
        return categoriaRepository.save(newCategoria);
    }

    private Categoria update(Categoria categoria) {
        var categoriaExistente = categoriaRepository.findById(categoria.getId())
                .orElseThrow(() -> new RuntimeException("Categoria não encontrada"));

        BeanUtils.copyProperties(categoria, categoriaExistente, "id", "datahoraCadastro", "criadoPor");

        return categoriaRepository.save(categoriaExistente);
    }

    public List<Categoria> findAll() {
        return categoriaRepository.findAll();
    }

}
