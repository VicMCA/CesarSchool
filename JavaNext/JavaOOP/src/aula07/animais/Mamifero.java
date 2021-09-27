package aula07.animais;

public class Mamifero extends Animal {
    private String corPelo;
    
    public Mamifero(Double peso, Integer idade, Integer quantidadeMembros, String corPelo) {
        super(peso, idade, quantidadeMembros);
        this.corPelo = corPelo;

    }

    @Override
    public void locomover() {
        System.out.println("Se locomoveu mamiferamente.");
    }

    @Override
    public void alimentar() {
        System.out.println("Se alimentou mamiferamente.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Emitiu som mamiferamente.");
    }

    public String getCorPelo() {
        return this.corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
}
