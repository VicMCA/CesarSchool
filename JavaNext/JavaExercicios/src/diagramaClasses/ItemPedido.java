package src.diagramaClasses;

public class ItemPedido {
    private Integer quantidade;
    public Produto varProduto;

    public ItemPedido() {}

    public ItemPedido(Integer quantidade, Produto varProduto) {
        this.quantidade = quantidade;
        this.varProduto = varProduto;
    }
}
