package src.diagramaClasses02;

public abstract class Fisica extends Pessoa
{
  private String cpf;
  private String rg;
  private String genero;
  private String nasc;
  
  public String getCpf() {
    return cpf;
  }
  public String getNasc() {
    return nasc;
  }
  public void setNasc(String nasc) {
    this.nasc = nasc;
  }
  public String getGenero() {
    return genero;
  }
  public void setGenero(String genero) {
    this.genero = genero;
  }
  public String getRg() {
    return rg;
  }
  public void setRg(String rg) {
    this.rg = rg;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
}