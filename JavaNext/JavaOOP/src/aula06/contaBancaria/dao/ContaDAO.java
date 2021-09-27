package aula06.contaBancaria.dao;

// import java.util.ArrayList;
import java.util.List;

// import aula06.contaBancaria.Banco;
import aula06.contaBancaria.Conta;
import aula06.contaBancaria.exceptions.RegistroNaoEncontradoException;

public interface ContaDAO {
    void salvar(Conta conta);

    void excluir(Conta conta);

    Conta buscar(String numero) throws RegistroNaoEncontradoException;

    void atualizar(Conta conta);

    List<Conta> listar();

    List<Conta> listarContasDoBanco(Integer numeroBanco, String nomeBanco);
}