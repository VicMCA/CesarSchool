package src.diagramaClasses;
import java.util.ArrayList;

public class Produto {
    private Double peso;
    private Integer quantidade;
    private String nome;
    private Double valor;
    private String descricao;
    public ArrayList<ItemPedido> varItemPedido;

    public Produto() {}

    public Produto(Double peso, Integer quantidade, String nome, Double valor, String descricao) {
        this.peso = peso;
        this.quantidade = quantidade;
        this.nome = nome;
        this.valor = valor;
        this.descricao = descricao;
    }
}
