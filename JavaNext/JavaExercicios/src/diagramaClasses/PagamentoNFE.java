package src.diagramaClasses;

import java.util.Date;

public class PagamentoNFE {
    private Double valor;
    private Date dataPagamento;

    public PagamentoNFE() {}

    public PagamentoNFE(Double valor, Date dataPagamento) {
        this.valor = valor;
        this.dataPagamento = dataPagamento;
    }

    public void efetuarPagamento() {
        return;
    }
}
