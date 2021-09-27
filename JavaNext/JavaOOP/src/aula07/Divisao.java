
package aula07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        
        Boolean pararExecucao = false;
        
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Informe o primeiro número: ");
                int primeiroNumero = scanner.nextInt();
                
                System.out.println("Informe o segundo número: ");
                int segundoNumero = scanner.nextInt();
    
                System.out.println("Resultado: " + (primeiroNumero / segundoNumero));
                pararExecucao = true;
                scanner.close();
            } catch (ArithmeticException ae) {
                System.err.println("Operação inválida.");
            } catch (InputMismatchException ime) {
                System.err.println("Valor inserido inválido.");
            } finally {
                System.out.println("Operação finalizada.");
            }
        } while (pararExecucao == false);

    }
}
