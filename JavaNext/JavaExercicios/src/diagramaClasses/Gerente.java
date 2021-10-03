package src.diagramaClasses;
import java.util.ArrayList;

public class Gerente extends Pessoa {

    public ArrayList<Funcionario> varListaFuncionario;
    public ArrayList<PedidoBasico> varListaPedido;

    public Gerente() {
        super();
    }

    public Gerente(String nome, String cpf, Integer matricula, String nomeUsuario,
    String cargo, Double salario, Boolean status, String senha, Endereco varEndereco) {
        super(nome, cpf, matricula, nomeUsuario, cargo, salario, status, senha, varEndereco);
    }
    
    public void listaFunction() {
        return;
    }
    public void listaCliente() {
        return;
    }
    public void criarFuncionario(Funcionario f) {
        varListaFuncionario.add(f);
    }
}
