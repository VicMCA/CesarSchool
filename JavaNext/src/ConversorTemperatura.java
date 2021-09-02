import java.util.Scanner; 

public class ConversorTemperatura {
    public static void main(String[] args) {
        
        int unidade = 0;
        double temperatura = 0.0;
        
        /* Descrição do problema:
            Estou tendo um loop infinito de prints ao tentar solucionar um problema de vazamento de 
        memória que o VSCode acusa em um dos objetos de Scanner. O problema também ocorre se eu utilizar
        instâncias com nomes diferentes entre si.
            Faço uso de dois loops while(true){try{}catch{}} para evitar que o usuário insira dados
        inválidos, mas desejo manter o programa solicitando inputs até que o usuário insira algo correto. */

        while(true) {
            try {
                System.out.println("Qual a unidade de temperatura que deseja usar? ");
                System.out.println("[1] Celsius [2] Fahrenheit [3] Kelvin [4] Réaumur [5] Rankine");
                Scanner read = new Scanner(System.in);
                unidade = read.nextInt();
                read.close(); // <- Parte problemática
                /* O VSCode acusa um problema de vazamento de memória se a linha do "read.close()" não
                estiver presente, mas com ela presente, o código entra em um print infinito ao chegar no
                próximo while(true) {try{}catch{}} */                
                break;
            } catch(Exception e) {
                System.out.printf("Valor inválido. ");
            }
        }
                
        while(true) {
            System.out.printf("Informe a temperatura na unidade informada: ");
            try {
                Scanner read = new Scanner(System.in);
                temperatura = read.nextDouble();
                read.close(); // <- Parte problemática, idêntica a de cima
                break;
            } catch(Exception e) {
                System.out.printf("Valor inválido. ");
            }
        }
        
        double kelvin = temperatura;
        double celsius = kelvin - 273.15;
        double fahrenheit = (kelvin * 1.8) + 459.67;
        double reaumur = (kelvin - 273.15) * 0.8;
        double rankine = kelvin * 1.8;

        // A parte abaixo ainda está incompleta.

        switch (unidade) {
            case 1:
                System.out.println(celsius + "º Celsius");
                break;
            case 2:
                System.out.println(fahrenheit+ "º Fahrenheit");
                break;
            case 3:
                System.out.println(kelvin + "º Kelvin");
                break;
            case 4:
                System.out.println(reaumur+ "º Réaumur");
                break;
            case 5:
                System.out.println(rankine + "º Rankine");
                break;
            default:
                break;
        }   
    }
}