package src.diagramaClasses;
import java.util.Date;
import java.util.ArrayList;

public class Pedido {
    private Date dataPedido;
    private Boolean status;
    private Double valorTotal;
    private PagamentoNFE varPagamento;
    public ArrayList<ItemPedido> varItemPedido = new ArrayList<ItemPedido>();

    public Pedido() {
        this.varPagamento = new PagamentoNFE();
    }

    public Pedido(Date dataPedido, Boolean status, Double valorTotal, PagamentoNFE varPagamento) {
        this.dataPedido = dataPedido;
        this.status = status;
        this.valorTotal = valorTotal;
        this.varPagamento = new PagamentoNFE();
    }

    public void statusPedido() {
        return;
    }
}
