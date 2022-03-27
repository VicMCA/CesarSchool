package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Funcionario extends Pessoa {
    
    @Column
    private Double salario;

    public Funcionario(String nome, String sobrenome, Double salario) {
        super(nome, sobrenome);
        this.salario = salario;
    }

    public Double getSalario() {
        return this.salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
