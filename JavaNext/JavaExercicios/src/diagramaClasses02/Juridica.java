package src.diagramaClasses02;

public abstract class Juridica extends Pessoa implements Funcionario {
  private String cnpj;
  private String inscricaoEstadual;
  private String fundacao;

  public void fazerCoisas() {
    System.out.println("Coisas feitas");
  }

  public String getCnpj() {
    return cnpj;
  }

  public String getFundacao() {
    return fundacao;
  }

  public void setFundacao(String fundacao) {
    this.fundacao = fundacao;
  }

  public String getInscricaoEstadual() {
    return inscricaoEstadual;
  }

  public void setInscricaoEstadual(String inscricaoEstadual) {
    this.inscricaoEstadual = inscricaoEstadual;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }
}