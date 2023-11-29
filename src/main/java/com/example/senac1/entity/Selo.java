package com.example.senac1.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "selo")
public class Selo {

    @Id
    @Column(name = "selo_id")
    private Long id;

    @Column(name = "selo_nome", length = 45)
    private String nome;

    @Column(name = "selo_descricao", length = 300)
    private String descricao;

    @Column( name = "selo_imagem")
    private String seloImagem;

    @Column(name = "selo_status")
    private Integer status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSeloImagem() {
        return seloImagem;
    }

    public void setSeloImagem(String seloImagem) {
        this.seloImagem = seloImagem;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
