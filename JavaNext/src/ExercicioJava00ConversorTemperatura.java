/*
Crie um programa para converter temperaturas entre a unidade que o usuário escolher
dentre 5 unidades disponíveis (Celsius, Fahrenheit, Kelvin, Réaumur e Rankine)
e as exiba nas outras unidades
*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class ExercicioJava00ConversorTemperatura {
    public static void main(String[] args) {
        
        int unidade = 0;
        double temperatura = 0.0;
        Scanner read;
        
        while(true) {
            try {
                System.out.println("Qual a unidade de temperatura que deseja usar? ");
                System.out.printf("[1] Celsius [2] Fahrenheit [3] Kelvin [4] Rankine [5] Réaumur >> ");
                read = new Scanner(System.in);
                unidade = read.nextInt();
                while(unidade > 5 || unidade < 1) {
                    System.out.println("Valor inválido. Informe novamente: ");
                    System.out.printf("[1] Celsius [2] Fahrenheit [3] Kelvin [4] Rankine [5] Réaumur >> ");
                    read = new Scanner(System.in);
                    unidade = read.nextInt();
                }         
                break;
            } catch(InputMismatchException exception) {
                System.out.printf("Valor inválido. ");
            }
        }
                
        while(true) {
            System.out.printf("Informe a temperatura na unidade selecionada: ");
            try {
                read = new Scanner(System.in);
                temperatura = read.nextDouble();
                break;
            } catch(InputMismatchException exception) {
                System.out.printf("Valor inválido. ");
            }
        }
        
        read.close();
        
        double kelvin = 0;

        switch (unidade) {
            case 1:
                // Celsius to Kelvin
                kelvin = temperatura + 273.5;
                break;
            case 2:
                // Fahrenheit to Kelvin
                kelvin = (temperatura + 459.67) / 1.8;
                break;
            case 3:
                // Just Kelvin
                kelvin = temperatura;
                break;
            case 4:
                // Rankine to Kelvin
                kelvin = temperatura / 1.8;
                break;
            case 5:
                // Réaumur to Kelvin
                kelvin = (temperatura * 1.25) + 273.15;
                break;
        }

        double celsius = kelvin - 273.15;
        double fahrenheit = (kelvin * 1.8) - 459.67;
        double rankine = kelvin * 1.8;
        double reaumur = (kelvin - 273.15) * 0.8;

        System.out.println("\nConfira a temperatura informada nas outras unidades de medida:");

        switch (unidade) {
            case 1:
                System.out.println(fahrenheit+ "º Fahrenheit");
                System.out.println(kelvin + "º Kelvin");
                System.out.println(rankine + "º Rankine");
                System.out.println(reaumur + "º Réaumur");
                break;
            case 2:
                System.out.println(celsius + "º Celsius");
                System.out.println(kelvin + "º Kelvin");
                System.out.println(rankine + "º Rankine");
                System.out.println(reaumur + "º Réaumur");
                break;
            case 3:
                System.out.println(celsius + "º Celsius");
                System.out.println(fahrenheit+ "º Fahrenheit");
                System.out.println(rankine + "º Rankine");
                System.out.println(reaumur + "º Réaumur");
                break;
            case 4:
                System.out.println(celsius + "º Celsius");
                System.out.println(fahrenheit+ "º Fahrenheit");
                System.out.println(kelvin + "º Kelvin");
                System.out.println(reaumur + "º Réaumur");
                break;
            case 5:
                System.out.println(celsius + "º Celsius");
                System.out.println(fahrenheit+ "º Fahrenheit");
                System.out.println(kelvin + "º Kelvin");
                System.out.println(rankine + "º Rankine");
                break;
            default:
                break;
        }   
    }
}