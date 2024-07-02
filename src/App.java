import java.time.LocalDate;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
        Autor autor = new Autor();

        autor.setNome(sc.nextLine());
        autor.setEmail(sc.nextLine());
        autor.setNacionalidade(sc.nextLine());
        
        Editora editora = new Editora();

        editora.setNome(sc.nextLine());
        editora.setAnoFundacao(sc.nextInt());
        editora.setFacebook(sc.nextLine());
        editora.setInstagram(sc.nextLine());
        editora.setTwitter(sc.nextLine());
        editora.setWebSite(sc.nextLine());
        
        Livro livro1 = new Livro();
        livro1.setTitulo(sc.nextLine());
        livro1.setSinopse(sc.nextLine());
        livro1.setGenero(sc.nextLine());
        livro1.setAnoLancamento(LocalDate.of(1996, 4, 7));
        livro1.setCapadura(true);
        livro1.setNumeroPaginas(sc.nextInt());
        livro1.setPreco(sc.nextDouble());
        livro1.setAutor(autor);
        livro1.setEditora(editora);

        livro1.aplicarDesconto(0.2);

        livro1.exibirDetalhes();
        System.out.println(" ");
        autor.exibirDetalhes();
        System.out.println(" ");
        editora.exibirDetalhes();
        sc.close();;
    }
}
