package com.example.demo.model;

import javax.persistence.*;

@Entity
public class Cliente extends Pessoa {

    @ManyToOne
    private Endereco endereco;

    public Cliente(String nome, String sobrenome, Endereco endereco) {
        super(nome, sobrenome);
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
