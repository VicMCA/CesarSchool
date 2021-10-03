/*
Escrever um algoritmo que lê: - a porcentagem do IPI a ser acrescido no valor das peças 
- o código da peça 1, valor unitário da peça 1, quantidade de peças 1 - o código da peça 
2, valor unitário da peça 2, quantidade de peças 2 O algoritmo deve calcular o valor total 
a ser pago e apresentar o resultado. Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1);
*/

package Exemplos;

import java.util.Scanner;

public class ExercicioJava08AjusteDePreco {
    public static void main(String[] args) throws Exception {
        
        double ipi = 0;
        double valorPeca1 = 0.0;
        int quantPeca1 = 0;
        double valorPeca2 = 0.0;
        int quantPeca2 = 0;

        Scanner read;
                
        while(true) {
            try {
                System.out.print("Digite o IPI da compra: ");
                read = new Scanner(System.in);
                ipi = read.nextDouble();
                break;
            } catch(Exception exception) {
                System.out.printf("Valor inválido. ");
            }
        }

        while(true) {
            try {
                System.out.print("Digite o código da primeira peça: ");
                read = new Scanner(System.in);
                break;
            } catch(Exception exception) {
                System.out.printf("Valor inválido. ");
            }
        }

        while(true) {
            try {
                System.out.print("Digite o preço da primeira peça: ");
                read = new Scanner(System.in);
                valorPeca1 = read.nextDouble();
                break;
            } catch(Exception exception) {
                System.out.printf("Valor inválido. ");
            }
        }

         while(true) {
            try {
                System.out.print("Digite quantas unidades deseja levar: ");
                read = new Scanner(System.in);
                quantPeca1 = read.nextInt();
                break;
            } catch(Exception exception) {
                System.out.printf("Valor inválido. ");
            }
        }

        while(true) {
            try {
                System.out.print("Digite o código da segunda peça: ");
                read = new Scanner(System.in);
                break;
            } catch(Exception exception) {
                System.out.printf("Valor inválido. ");
            }
        }

        while(true) {
            try {
                System.out.print("Digite o preço da segunda peça: ");
                read = new Scanner(System.in);
                valorPeca2 = read.nextDouble();
                break;
            } catch(Exception exception) {
                System.out.printf("Valor inválido. ");
            }
        }

         while(true) {
            try {
                System.out.print("Digite quantas unidades deseja levar: ");
                read = new Scanner(System.in);
                quantPeca2 = read.nextInt();
                break;
            } catch(Exception exception) {
                System.out.printf("Valor inválido. ");
            }
        }
        
        read.close();

        // Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1);

        double valorTotal = ((valorPeca1 * quantPeca1) + (valorPeca2 * quantPeca2)) * ((ipi/100) + 1);
        System.out.println("Valor total da compra: R$ " + valorTotal);
        
    }
}