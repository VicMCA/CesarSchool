import java.util.Scanner;
import java.util.InputMismatchException;

public class ExercicioJava03Fatorial {
    public static void main(String[] args) throws Exception {
        long numeroFatorial;
        long resultado = 1l;

        Scanner read;
        
        while(true) {
            try {
                System.out.print("Qual número deseja fatorar? >> ");
                read = new Scanner(System.in);
                numeroFatorial = read.nextLong();
                break;
            } catch(InputMismatchException exception) {
                System.out.printf("Número inválido. ");
            }
        }

        read.close();

        for (long count = numeroFatorial; count > 0; count--) {
            resultado = count * resultado;
        }

        System.out.println("Resultado da fatoração >> " + resultado);
    }
}