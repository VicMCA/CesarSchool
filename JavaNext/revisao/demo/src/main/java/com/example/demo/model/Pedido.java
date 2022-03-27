package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Pedido extends AbstractEntity {

    @Column
    private Date dataPedido;
    @Column
    private Integer quantidade;
    @Column
    private Double valorTotal;

    @OneToOne
    @JoinColumn(name = "cliente")
    private Cliente cliente;
    @OneToOne
    @JoinColumn(name = "produto")
    private Produto produto;

    public Pedido(Date dataPedido, Integer quantidade, Double valorTotal,
    Cliente cliente, Produto produto) {
        this.dataPedido = dataPedido;
        this.quantidade = quantidade;
        this.valorTotal = valorTotal;
        this.cliente = cliente;
        this.produto = produto;
    }

    public Date getDataPedido() {
        return this.dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public Integer getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValorTotal() {
        return this.valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Produto getProduto() {
        return this.produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

}
