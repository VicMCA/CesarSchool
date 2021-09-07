import java.util.Scanner;

public class ExtraJava01Intervalos {
    public static void main(String[] args) throws Exception {
        
        // Respectivo ao exercício número 1037 do URI Online Judge
        
        double varInput;
        Scanner read = new Scanner(System.in);

        int intervalos[][] = {
            {0, 25},
            {25, 50},
            {50, 75},
            {75, 100}
        };

        System.out.print("Informe um número entre 0 e 100 >> ");
        varInput = read.nextDouble();

        if (varInput >= 0 && varInput <= 100) {
            for (int i = 0; i < intervalos.length; i++) {
                int[] btwn = intervalos[i];
    
                if (varInput == btwn[0]) {
                    System.out.println("Intervalo (" + btwn[0] + ", " + btwn[1] + "]");
                    break;
                } else if (varInput == btwn[1]) {
                    System.out.println("Intervalo [" + btwn[0] + ", " + btwn[1] + ")");
                    break;
                } else if (varInput > btwn[0] && varInput < btwn[1]) {
                    System.out.println("Intervalo [" + btwn[0] + ", " + btwn[1] + "]");
                    break;
                }    
            }
        } else {
            System.out.println("Valor inválido. ");
        }
            
        read.close();
    }    
}
