package src.diagramaClasses;
import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String cpf;
    private String nomeUsuario;
    private String cargo;
    private Double salario;
    private Boolean status;
    private String senha;
    private Endereco varEndereco;
    public ArrayList<PedidoDelivery> varListaPedido;

    public Cliente() {
        this.varEndereco = new Endereco();
    }

    public Cliente(String nome, String cpf, String nomeUsuario, String cargo,
    Double salario, Boolean status, String senha, Endereco varEndereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.nomeUsuario = nomeUsuario;
        this.cargo = cargo;
        this.salario = salario;
        this.status = status;
        this.senha = senha;
        this.varEndereco = new Endereco();
    }
}
