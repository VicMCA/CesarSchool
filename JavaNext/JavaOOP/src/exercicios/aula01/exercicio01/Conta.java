package exercicios.aula01.exercicio01;

public class Conta {
    private String numero;
    private Double saldo;

    public Conta(String numero, Double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }
    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double novoSaldo) {
        saldo = novoSaldo;
    }
    public void creditar(Double credito) {
        saldo += credito;
    }
    public void debitar(Double debito) {
        saldo -= debito;
    }
}
