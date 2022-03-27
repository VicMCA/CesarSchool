package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Produto extends AbstractEntity {
    
    @Column
    private String nome;
    @Column
    private String descricao;
    @Column
    private Integer codigo;
    @Column
    private Double valor;

    public Produto(String nome, String descricao, Integer codigo, Double valor) {
        this.nome = nome;
        this.descricao = descricao;
        this.codigo = codigo;
        this.valor = valor;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getCodigo() {
        return this.codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Double getValor() {
        return this.valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
