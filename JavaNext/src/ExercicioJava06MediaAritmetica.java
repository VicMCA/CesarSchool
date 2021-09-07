/*
Fazer um programa que imprima a média aritmética dos números 8,9 e 7.
A média dos números 4, 5 e 6. A soma das duas médias. A média das médias. 
*/

public class ExercicioJava06MediaAritmetica {
    public static void main(String[] args) throws Exception{
        double media1 = (7 + 8 + 9) / 3;
        double media2 = (4 + 5 + 6) / 3;

        System.out.println("Primeira média: " + media1);
        System.out.println("Segunda média: " + media2);
        System.out.println("Média geral: " + (media1 + media2) / 2);
    }
}
