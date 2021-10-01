package src.diagramaClasses;
import java.util.ArrayList;

public class Funcionario extends Pessoa {

    public ArrayList<PedidoBasico> varListaPedidos;

    public Funcionario() {
        super();
    }

    public Funcionario(String nome, String cpf, Integer matricula, String nomeUsuario,
    String cargo, Double salario, Boolean status, String senha, Endereco varEndereco) {
        super(nome, cpf, matricula, nomeUsuario, cargo, salario, status, senha, varEndereco);
    }
    
    public void listarPedidos() {
        return;
    }

    public void editarPedido() {
        return;
    }
}
