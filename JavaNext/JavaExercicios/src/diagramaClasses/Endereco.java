package src.diagramaClasses;

public class Endereco {
    private String rua;
    private Integer numero;
    private String cep;
    private String complemento;
    private Integer telefone;
    private String cidade;
    private String bairro;

    public Endereco() {}

    public Endereco(String rua, Integer numero, String cep, String complemento,
    Integer telefone, String cidade, String bairro) {
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
        this.complemento = complemento;
        this.telefone = telefone;
        this.cidade = cidade;
        this.bairro = bairro;
    }
}
