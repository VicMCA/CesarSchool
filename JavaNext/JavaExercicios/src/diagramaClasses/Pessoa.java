package src.diagramaClasses;

public class Pessoa {
    private String nome;
    private String cpf;
    private Integer matricula;
    private String nomeUsuario;
    private String cargo;
    private Double salario;
    private Boolean status;
    private String senha;
    private Endereco varEndereco;

    public Pessoa() {
        this.varEndereco = new Endereco();
    }

    public Pessoa(String nome, String cpf, Integer matricula, String nomeUsuario,
    String cargo, Double salario, Boolean status, String senha, Endereco varEndereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
        this.nomeUsuario = nomeUsuario;
        this.cargo = cargo;
        this.salario = salario;
        this.status = status;
        this.senha = senha;
        this.varEndereco = new Endereco();
    }
}