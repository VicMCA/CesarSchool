package aula07;

import aula07.animais.*;

public class App {
    public static void main(String[] args) {
        Cachorro mandaJobs = new Cachorro(25.0, 1, 4, "Caramelo Escuro");
        Tartaruga ligeirinho = new Tartaruga(80.0, 50, 4, "Verde Musgo");
        PeixePalhaco jamanta = new PeixePalhaco(0.2, 2, 3, "Laranja e Branco");

        mandaJobs.locomover();
        mandaJobs.emitirSom();
        mandaJobs.alimentar();
        mandaJobs.reagir(true);
        mandaJobs.reagir(false);
        mandaJobs.reagir("Oi doguinho!");
        mandaJobs.reagir("Cala a boca");
        mandaJobs.reagir("Quem é o lindão?");

        System.out.println("------------------------");

        ligeirinho.locomover();
        ligeirinho.emitirSom();
        ligeirinho.alimentar();

        System.out.println("------------------------");

        jamanta.locomover();
        jamanta.emitirSom();
        jamanta.alimentar();
    }
}