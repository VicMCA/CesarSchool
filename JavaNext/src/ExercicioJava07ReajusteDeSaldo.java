import java.util.Scanner;
import java.util.InputMismatchException;

public class ExercicioJava07ReajusteDeSaldo {
    public static void main(String[] args) {
        double saldo;
        Scanner read;
        
        while(true) {
            try {
                System.out.print("\nOlá. Informe seu saldo atual >> R$ ");
                read = new Scanner(System.in);
                saldo = read.nextDouble();
                break;
            } catch(InputMismatchException exception) {
                System.out.printf("Valor de saldo inválido. ");
            }
        }

        read.close();

        System.out.println("Seu saldo passou por reajuste de 1%. Confira abaixo o novo saldo:");
        System.out.println("Saldo atual: R$ " + (saldo + (saldo / 100)));
    }    
}
