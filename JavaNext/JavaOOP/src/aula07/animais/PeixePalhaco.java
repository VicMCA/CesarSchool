package aula07.animais;

public class PeixePalhaco extends Peixe {

    public PeixePalhaco(Double peso, Integer idade, Integer quantidadeMembros, String corEscamas) {
        super(peso, idade, quantidadeMembros, corEscamas);
    }
    
    @Override
    public void locomover() {
        System.out.println("Nadou ligeiramente por entre as anêmonas.");
    }
}
