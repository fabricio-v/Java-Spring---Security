package com.teste.seguranca.domain.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.OffsetDateTime;
import java.util.UUID;

@Entity
@Table(name = "categoria")
@EntityListeners(AuditingEntityListener.class)
public class Categoria {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @CreatedBy
    @Column(name = "criado_por")
    private UUID criadoPor;

    @CreationTimestamp
    @Column(name = "datahora_cadastro", nullable = false)
    private OffsetDateTime datahoraCadastro;

    @LastModifiedBy
    @Column(name = "alterado_por")
    private UUID alteradoPor;

    @UpdateTimestamp
    @Column(name = "datahora_alteracao", nullable = false)
    private OffsetDateTime datahoraAlteracao;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public UUID getCriadoPor() {
        return criadoPor;
    }

    public void setCriadoPor(UUID criadoPor) {
        this.criadoPor = criadoPor;
    }

    public OffsetDateTime getDatahoraCadastro() {
        return datahoraCadastro;
    }

    public void setDatahoraCadastro(OffsetDateTime datahoraCadastro) {
        this.datahoraCadastro = datahoraCadastro;
    }

    public UUID getAlteradoPor() {
        return alteradoPor;
    }

    public void setAlteradoPor(UUID alteradoPor) {
        this.alteradoPor = alteradoPor;
    }

    public OffsetDateTime getDatahoraAlteracao() {
        return datahoraAlteracao;
    }

    public void setDatahoraAlteracao(OffsetDateTime datahoraAlteracao) {
        this.datahoraAlteracao = datahoraAlteracao;
    }
}