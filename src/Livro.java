import java.time.LocalDate;

public class Livro {
  private String titulo;
  private String sinopse;
  private String isbm;
  private String genero;
  private boolean capadura;
  private LocalDate anoLancamento;
  private int numeroPaginas;
  private double preco;
  private Autor autor;
  private Editora editora;

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    System.out.println("Titulo: ");
    this.titulo = titulo;
  }

  public String getSinopse() {
    return sinopse;
  }

  public void setSinopse(String sinopse) {
    System.out.println("Sinopse");
    this.sinopse = sinopse;
  }

  public String getIsbm() {
    return isbm;
  }

  public void setIsbm(String isbm) {
    this.isbm = isbm;
  }

  public String getGenero() {
    return genero;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  public boolean isCapadura() {
    return capadura;
  }

  public void setCapadura(boolean capadura) {
    this.capadura = capadura;
  }

  public LocalDate getAnoLancamento() {
    return anoLancamento;
  }

  public void setAnoLancamento(LocalDate anoLancamento) {
    this.anoLancamento = anoLancamento;
  }

  public int getNumeroPaginas() {
    return numeroPaginas;
  }

  public void setNumeroPaginas(int numeroPaginas) {
    this.numeroPaginas = numeroPaginas;
  }

  public double getPreco() {
    return preco;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public Autor getAutor() {
    return autor;
  }

  public void setAutor(Autor autor) {
    this.autor = autor;
  }

  public Editora getEditora() {
    return editora;
  }

  public void setEditora(Editora editora) {
    this.editora = editora;
  }
  
  double aplicarDesconto(double desconto){
    if(preco < 20){
      return preco;
    }
    preco *= (1- desconto);
    return preco;
  }


  void exibirDetalhes() {
    System.out.println("Detalhes do Livro");
    System.out.println("Título: " + titulo);
    System.out.println("Sinopse: " + sinopse);
    System.out.println("ISBN: " + isbm);
    System.out.println("Gênero: " + genero);
    System.out.println("Capa: " + (capadura ? "Sim" : "Não"));
    System.out.println("Ano de lançamento: " + anoLancamento);
    System.out.println("Número de páginas: " + numeroPaginas);
    System.out.println("Preço: " + preco);
    System.out.println("Autor: " + autor.getNome());
    System.out.println("Editora: " + editora.getNome());

    autor.exibirDetalhes();
    editora.exibirDetalhes();

  }
}
