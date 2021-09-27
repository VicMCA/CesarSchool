package aula06.contaBancaria;

import java.util.ArrayList;

public class Banco {
    private String nome;
    private Integer codigo;
    private ArrayList<Conta> contas;

    public Banco(String nome, Integer codigo, ArrayList<Conta> contas) {
        this.nome = nome;
        this.codigo = codigo;
        this.contas = contas;
    }
    
    public void transferir(
        String contaOrigem,
        String contaDestino,
        Double valor)
        {
        Conta destino = null;
        Conta origem = null;

        for (int i = 0; i < contas.size(); i++) {
            Conta contaAtual = contas.get(i);
            if (contaAtual.numero.equals(contaOrigem)) {
                origem = contaAtual;
            }
            if (contaAtual.numero.equals(contaDestino)) {
                destino = contaAtual;
            }
        }

        if (destino == null || origem == null) {
            System.out.println("Dados de uma das contas inválido");
            return;
        }

        origem.debitarSaldo(valor);
        destino.creditarSaldo(valor);
    }

    public void transferir(
        String agenciaOrigem, 
        String contaOrigem, 
        String agenciaDestino, 
        String contaDestino,
        String cpf,
        String nomeTitular,
        Double valor)
        {
        Conta origem = null;

        for (int i = 0; i < contas.size(); i++) {
            Conta contaAtual = contas.get(i);
            if (contaAtual.numero.equals(contaOrigem)) {
                origem = contaAtual;
            }
        }

        if (origem == null) {
            System.out.println("Dados da conta origem inválidos");
        }

        origem.debitarSaldo(valor);
        System.out.println("O valor de R$ " + valor + " foi transferido com sucesso para outro banco");
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigo() {
        return this.codigo;
    }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Conta> getContas() {
        return this.contas;
    }
    public void setContas(ArrayList<Conta> contas) {
        this.contas = contas;
    }
    
}
