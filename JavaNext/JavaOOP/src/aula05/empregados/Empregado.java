package aula05.empregados;

public class Empregado {
    private String nome;
    private String cpf;
    private String nis;
    protected Double salario;

    public Empregado(String nome, String cpf, String nis, Double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.nis = nis;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return (
            "Nome: " + getNome() + "\n" +
            "CPF: " + getCpf() + "\n" +
            "NIS: " + getNis() + "\n" +
            "Salário: R$ " + getSalario()+ "\n"
        );
    }

    public String getNome() {
        return this.nome;
    }
    public String getCpf() {
        return this.cpf;
    }
    public String getNis() {
        return this.nis;
    }
    public Double getSalario() {
        return this.salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setNis(String nis) {
        this.nis = nis;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }
}