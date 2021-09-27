package exercicios.aula04.exercicio02;

public class Ingresso extends Object {
    private Double valor;

    public Ingresso(Double valor) {
        this.valor = valor;
    }

    public Ingresso() {

    }

    @Override
    public String toString() {
        return "Valor do ingresso: " + valor;
    }

}
