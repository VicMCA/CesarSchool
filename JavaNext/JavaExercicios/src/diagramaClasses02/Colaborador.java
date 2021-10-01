package src.diagramaClasses02;

public class Colaborador extends Fisica {
    private String ctps;
    private String pis;
    private String tituloEleitor;
    private boolean reservista;
    private String estadoCivil;
    private int numDependente;
    private boolean ativo;
    private String setor;
    private String cargo;
    private double salario;
    private String telefone1;
    private String telefone2;
    private String emailPessoal;
    private String emailCorporativo;
  
    private void Admitir() {
      System.out.println("Metodo que faz alguma coisa");
    }
  
    private void Demitir() {
      System.out.println("Metodo que faz outra coisa");
    }
  
    public String getEmailCorporativo() {
      return emailCorporativo;
    }
  
    public void setEmailCorporativo(String emailCorporativo) {
      this.emailCorporativo = emailCorporativo;
    }
  
    public String getEmailPessoal() {
      return emailPessoal;
    }
  
    public void setEmailPessoal(String emailPessoal) {
      this.emailPessoal = emailPessoal;
    }
  
    public String getTelefone2() {
      return telefone2;
    }
  
    public void setTelefone2(String telefone2) {
      this.telefone2 = telefone2;
    }
  
    public String getTelefone1() {
      return telefone1;
    }
  
    public void setTelefone1(String telefone1) {
      this.telefone1 = telefone1;
    }
  
    public double getSalario() {
      return salario;
    }
  
    public void setSalario(double salario) {
      this.salario = salario;
    }
  
    public String getCargo() {
      return cargo;
    }
  
    public void setCargo(String cargo) {
      this.cargo = cargo;
    }
  
    public String getSetor() {
      return setor;
    }
  
    public void setSetor(String setor) {
      this.setor = setor;
    }
  
    public boolean isAtivo() {
      return ativo;
    }
  
    public void setAtivo(boolean ativo) {
      this.ativo = ativo;
    }
  
    public int getNumDependente() {
      return numDependente;
    }
  
    public void setNumDependente(int numDependente) {
      this.numDependente = numDependente;
    }
  
    public String getEstadoCivil() {
      return estadoCivil;
    }
  
    public void setEstadoCivil(String estadoCivil) {
      this.estadoCivil = estadoCivil;
    }
  
    public boolean isReservista() {
      return reservista;
    }
  
    public void setReservista(boolean reservista) {
      this.reservista = reservista;
    }
  
    public String getTituloEleitor() {
      return tituloEleitor;
    }
  
    public void setTituloEleitor(String tituloEleitor) {
      this.tituloEleitor = tituloEleitor;
    }
  
    public String getPis() {
      return pis;
    }
  
    public void setPis(String pis) {
      this.pis = pis;
    }
  
    public String getCtps() {
      return ctps;
    }
  
    public void setCtps(String ctps) {
      this.ctps = ctps;
    }
  
}