package src.diagramaClasses;
import java.util.Date;

public class PedidoBasico extends Pedido {
    private String nome;

    public PedidoBasico() {
        super();
    }

    public PedidoBasico(String nome, Date dataPedido, Boolean status,
    Double valorTotal, PagamentoNFE varPagamento) {
        super(dataPedido, status, valorTotal, varPagamento);
        this.nome = nome;
    }
}
