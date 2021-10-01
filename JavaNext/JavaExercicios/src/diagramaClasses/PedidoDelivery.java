package src.diagramaClasses;
import java.util.Date;

public class PedidoDelivery extends Pedido {
    private Cliente varCliente;

    public PedidoDelivery(){
        super();
    }

    public PedidoDelivery(Cliente varCliente, Date dataPedido, Boolean status,
    Double valorTotal, PagamentoNFE varPagamento) {
        super(dataPedido, status, valorTotal, varPagamento);
        this.varCliente = varCliente;
    }
}
