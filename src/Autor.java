public class Autor {
  private String nome;
  private String email;
  private String nacionalidade;

  public void setNome(String nome) {
    System.out.println("Nome Autor");
    this.nome = nome;
  }
  public String getNome() {
    return nome;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    System.out.println("Email");
    this.email = email;
  }

  public String getNacionalidade() {
    return nacionalidade;
  }

  public void setNacionalidade(String nacionalidade) {
    System.out.println("Nacionalidade Autor");
    this.nacionalidade = nacionalidade;
  }

  void exibirDetalhes() {
    System.out.println("Detalhes do Autor");
    System.out.println("Nome do autor: " + nome);
    System.out.println("email do autor: " + email);
    System.out.println("Nacionalidade do autor: " + nacionalidade);
  }
}