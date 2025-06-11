public class Livros {
    String nome;
    String descricao;
    private double valor;
    String isbn;
    Autor autor; // Composição
    private boolean impresso;


    public Livros(Autor autor) {
        this.autor = autor;
        this.isbn = "000-00-00000-00-0";
        this.impresso = true;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public boolean setNome(String nome) {
        if (nome.length() <= 2) {
            return false; // Nome muito curto
        }
        this.nome = nome;
        return true;
    }



    public void mostrarDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);
        autor.mostrarDetalhes();
        System.out.println("--");
    }

    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.3) {
            return false;
        }
        this.valor -= this.valor * porcentagem;
        return true;
    }

    public boolean hasAutor() {
        return this.autor != null;
    }
}
