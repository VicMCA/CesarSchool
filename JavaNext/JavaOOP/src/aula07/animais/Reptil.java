package aula07.animais;

public class Reptil extends Animal {
    private String corEscamas;

    public Reptil(Double peso, Integer idade, Integer quantidadeMembros, String corEscamas) {
        super(peso, idade, quantidadeMembros);
        this.corEscamas = corEscamas;
    }

    @Override
    public void locomover() {
        System.out.println("Se locomoveu reptilianamente.");
    }

    @Override
    public void alimentar() {
        System.out.println("Se alimentou reptilianamente.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Emitiu som reptilianamente.");
    }

    public String getCorEscamas() {
        return this.corEscamas;
    }

    public void setCorEscamas(String corEscamas) {
        this.corEscamas = corEscamas;
    }

}
