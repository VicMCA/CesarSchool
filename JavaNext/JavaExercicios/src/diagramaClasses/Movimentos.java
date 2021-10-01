package src.diagramaClasses;
import java.util.Date;

public class Movimentos {
    private Date hora;
    private Double valor;

    public Movimentos() {}

    public Movimentos(Date hora, Double valor) {
        this.hora = hora;
        this.valor = valor;
    }
}
