package exercicios.aula01.exercicio01;

public class Teste {
    public static void main(String[] args) throws Exception {
        Cliente abigobaldo = new Cliente("Abigobaldo Girismundo", "999.999.999.99");

        System.out.println("Nome do cliente: " + abigobaldo.nome);
        System.out.println("CPF: " + abigobaldo.cpf);

        Conta abigobaldoConta = new Conta("000999.9", 100.0);

        System.out.println("Número da conta: " + abigobaldoConta.getNumero());
        System.out.println("Saldo atual: " + abigobaldoConta.getSaldo());
        
        abigobaldoConta.setSaldo(200.0);
        System.out.println("Saldo atual: " + abigobaldoConta.getSaldo());
        
        abigobaldoConta.creditar(300.0);
        System.out.println("Saldo atual: " + abigobaldoConta.getSaldo());
        
        abigobaldoConta.debitar(150.0);
        System.out.println("Saldo atual: " + abigobaldoConta.getSaldo());
    }
    
}
