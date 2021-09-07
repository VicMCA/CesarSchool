/*
A seqüência de Fibonacci possui como primeiro e segundo elementos o número 1. A
partir de então, os próximos números são o resultado da soma dos dois números
anteriores.
Ex: 1, 1, 2, 3, 5, 8, 13, 21, ...
Crie uma classe chamada Fibonacci e mande criar o método main.
No método main implemente um programa que lê um número do teclado e em seguida
imprime a seqüência de Fibonacci até o n-esimo número.
*/

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