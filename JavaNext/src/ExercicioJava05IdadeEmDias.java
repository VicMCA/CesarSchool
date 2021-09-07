/*
Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e 
mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30. 
(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.) 
*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class ExercicioJava05IdadeEmDias {
    public static void main(String[] args) {
        int idadeAnos;
        int idadeMeses;
        int idadeDias;
        Scanner read;
        
        System.out.println("\nOlá, converteremos sua idade de anos/meses/dias para dias.");

        while(true) {
            try {
                System.out.print("Informe quantos anos você tem >> ");
                read = new Scanner(System.in);
                idadeAnos = read.nextInt();
                break;
            } catch(InputMismatchException exception) {
                System.out.printf("Valor inválido. ");
            }
        }

        while(true) {
            try {
                System.out.print("Informe quantos meses você fez >> ");
                read = new Scanner(System.in);
                idadeMeses = read.nextInt();
                break;
            } catch(InputMismatchException exception) {
                System.out.printf("Valor inválido. ");
            }
        }

        while(true) {
            try {
                System.out.print("Informe quantos dias você completou >> ");
                read = new Scanner(System.in);
                idadeDias = read.nextInt();
                break;
            } catch(InputMismatchException exception) {
                System.out.printf("Valor inválido. ");
            }
        }
        
        read.close();

        int totalDias = (idadeAnos * 365) + (idadeMeses * 30) + idadeDias;

        System.out.println("Você completou um total de " + totalDias + " dias!");
    }
}