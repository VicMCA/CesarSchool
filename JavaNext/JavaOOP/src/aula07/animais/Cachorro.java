package aula07.animais;

public class Cachorro extends Mamifero {

    public Cachorro(Double peso, Integer idade, Integer quantidadeMembros, String corPelo) {
        super(peso, idade, quantidadeMembros, corPelo);
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Woof woof!");
    }
    
    @Override
    public void alimentar() {
        System.out.println("Comeu teu lanche e os biscoitinhos de osso!");
    }

    @Override
    public void locomover() {
        System.out.println("Saiu correndo na sua frente!");
    }

    public void reagir(Boolean isDono) {
        if (isDono) {
            System.out.println("Está feliz em lhe ver!");
        } else {
            System.out.println("Corre que tá te estranhando!");
        }
    }

    public void reagir(String cumprimento) {
        if (cumprimento == "Oi doguinho!") {
            System.out.println("Está feliz em conversar!");
        } else if (cumprimento == "Cala a boca") {
            System.out.println("Corre que tu vai levar uma mordida!");
        } else {
            System.out.println("Está te olhando confusamente e aguardando comida.");
        }
    }
}
