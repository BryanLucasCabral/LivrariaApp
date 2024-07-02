public class Editora {
  private String nome;
  private int anoFundacao;
  private String webSite;
  private String facebook;
  private String twitter;
  private String instagram;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    System.out.println("Nome Editora: ");
    this.nome = nome;
  }

  public int getAnoFundacao() {
    return anoFundacao;
  }

  public void setAnoFundacao(int anoFundacao) {
    System.out.println("Ano de fundação: ");
    this.anoFundacao = anoFundacao;
  }

  public String getWebSite() {
    return webSite;
  }

  public void setWebSite(String webSite) {
    System.out.println("WebSite: ");
    this.webSite = webSite;
  }

  public String getFacebook() {
    return facebook;
  }

  public void setFacebook(String facebook) {
    System.out.println("Facebook: ");
    this.facebook = facebook;
  }

  public String getTwitter() {
    return twitter;
  }

  public void setTwitter(String twitter) {
    System.out.println("Twitter: ");
    this.twitter = twitter;
  }

  public String getInstagram() {
    return instagram;
  }

  public void setInstagram(String instagram) {
    System.out.println("Instagram: ");
    this.instagram = instagram;
  }

  void exibirDetalhes() {
    System.out.println("Detalhes da Editora");
    System.out.println("Nome: " + nome);
    System.out.println("Ano de fundação: " + anoFundacao);
    System.out.println("Instragram" + instagram);
    System.out.println("Facebook: " + facebook);
    System.out.println("Twitter: " + twitter);
    System.out.println("WebSite: " + webSite);
  }
}
