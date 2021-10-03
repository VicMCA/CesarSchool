package aula07.animais;

public class Peixe extends Animal {
    private String corEscamas;

    public Peixe(Double peso, Integer idade, Integer quantidadeMembros, String corEscamas) {
        super(peso, idade, quantidadeMembros);
        this.corEscamas = corEscamas;
    }

    public void soltarBolhas() {
        System.out.println("Glub glub.");
    }

    @Override
    public void locomover() {
        System.out.println("Se locomoveu nadando peixamente.");
    }

    @Override
    public void alimentar() {
        System.out.println("Se alimentou peixamente.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Emitiu som peixamente.");
    }

    public String getCorEscamas() {
        return this.corEscamas;
    }

    public void setCorEscamas(String corEscamas) {
        this.corEscamas = corEscamas;
    }

}
