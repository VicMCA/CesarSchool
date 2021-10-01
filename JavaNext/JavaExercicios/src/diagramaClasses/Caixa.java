package src.diagramaClasses;

import java.util.Date;

public class Caixa {
    private Double valorReceita;
    private Date dataAbertura;
    private Date dataFechamento;
    private Movimentos varMovimentos;

    public Caixa() {
        this.varMovimentos = new Movimentos();
    }

    public Caixa(Double valorReceita, Date dataAbertura, Date dataFechamento, Movimentos varMovimentos) {
        this.valorReceita = valorReceita;
        this.dataAbertura = dataAbertura;
        this.dataFechamento = dataFechamento;
        this.varMovimentos = new Movimentos();
    }
}