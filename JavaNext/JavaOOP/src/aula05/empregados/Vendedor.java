package aula05.empregados;

public class Vendedor extends Empregado {
    private Double percentual;

    public Vendedor(String nome, String cpf, String nis, Double salario, Double percentual) {
        super(nome, cpf, nis, salario);
        this.percentual = percentual;
    }

    public Double getPercentual() {
        return this.percentual;
    }

    public void setPercentual(Double percentual) {
        this.percentual = percentual;
    }
    
    @Override
    public String toString() {
        return super.toString() + "Salário + Bônus de Comissão: R$ " + calcularSalario() + "% \n";
    }

    public Double calcularSalario() {
        return getSalario() * ( 1 + (getPercentual()/100));
    }
}
