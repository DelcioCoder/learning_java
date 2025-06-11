public class CadastroLivros {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Dercio");
        Livros livro = new Livros(autor);
        livro.nome = "Java prático";
        livro.descricao = "Novos recursos da linguagem.";
        livro.setValor( 59.90);
        livro.isbn = "978-85-66250-46-6";

        autor.setNome("Rodrigo Turini");
        autor.setEmail("armandodelcio40@gmail.com");
        autor.setCpf("000.000.000-00");

        livro.autor = autor;

        if(livro.hasAutor()) {
            livro.mostrarDetalhes();
        }
    }
}
