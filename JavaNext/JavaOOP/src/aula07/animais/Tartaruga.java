package aula07.animais;

public class Tartaruga extends Reptil {

    public Tartaruga(Double peso, Integer idade, Integer quantidadeMembros, String corEscamas) {
        super(peso, idade, quantidadeMembros, corEscamas);
    }
    
    @Override
    public void locomover() {
        System.out.println("Aaaaaannnnnnddooooooooouuuuuuuuuuuuuuuuu..... uuuummmmm poooooouuuuucccooooooo.....");
    }

    @Override
    public void alimentar() {
        System.out.println("Aaaiiinnnddaaa eeessstttáááá maaaasssstttiiiggaaaaaaannnddoooooo......");
    }

    @Override
    public void emitirSom() {
        System.out.println("Você ouve o som de seu dedo sendo quebrado pela forte mandíbula da tartaruga, mais rápida do que você imaginava.");
    }
}
