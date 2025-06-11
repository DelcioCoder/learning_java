public class CadastroLivros {
    public static void main(String[] args) {
        Livros livro = new Livros();
        livro.nome = "Java prático";
        livro.descricao = "Novos recursos da linguagem.";
        livro.setValor( 59.90);
        livro.isbn = "978-85-66250-46-6";

        Livros livro1 = new Livros("java prático", "Novos recurso da linguagem.", 59.90, "978-85-66250-46-6");
        Livros livro2 = new Livros();
        Livros livro3 = new Livros();

        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");
        autor.setEmail("armandodelcio40@gmail.com");
        autor.setCpf("000.000.000-00");

        livro.autor = autor;

        if(livro.hasAutor()) {
            livro.mostrarDetalhes();
        }
    }
}
