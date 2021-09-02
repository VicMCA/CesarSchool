import java.util.Scanner;
import java.util.InputMismatchException;

public class ExercicioJava04Fibonacci {
    public static void main(String[] args) throws Exception {
        long numeroFibonacci;
        long resultado = 0l;
        long tempUm = 1l;
        long tempDois = 0l;

        Scanner read;
        
        while(true) {
            try {
                System.out.print("Quantos números de Fibonacci deseja exibir? >> ");
                read = new Scanner(System.in);
                numeroFibonacci= read.nextLong();
                break;
            } catch(InputMismatchException exception) {
                System.out.printf("Número inválido. ");
            }
        }

        read.close();

        System.out.println("0\n1");
        for (long count = 0; count < (numeroFibonacci - 2); count++) {
            resultado = tempUm + tempDois;
            tempDois = tempUm;
            tempUm = resultado;            
            System.out.println(resultado);
        }
    }
}