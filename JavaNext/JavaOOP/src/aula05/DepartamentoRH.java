package aula05;

import aula05.empregados.*;

public class DepartamentoRH {
    public static void main(String[] args) {
        System.out.println("\n-------------------\n");

        Empregado kevinhill = new Empregado(
            "Kevin Hill",
            "111.222.333-44",
            "5566778899",
            5000.00
        );

        System.out.println(kevinhill.toString() + "\n-------------------\n");

        Gerente jessicamccabe = new Gerente(
            "Jessica McCabe",
            "555.666.777-88",
            "9900112233",
            8000.00,
            "Personel Counseling"
        );

        System.out.println(jessicamccabe.toString() + "\n-------------------\n");

        Vendedor kylehill = new Vendedor(
            "Kyle Hill",
            "999.000.111-22",
            "3344556677",
            6000.00,
            15.0
        );

        System.out.println(kylehill.toString() + "\n-------------------\n");
    }    
}
