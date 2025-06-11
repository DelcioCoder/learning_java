public class ComparandoReferencias {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.nome = "Rodrigo";
        autor.email = "armandodelcio40@gmail.com";
        autor.cpf = "000.000.000-00";

        Autor autor2 = new Autor();
        autor2.nome = "Rodrigo";
        autor2.email = "armandodelcio40@gmail.com";
        autor2.cpf = "000.000.000-00";

        if (autor == autor2) {
            System.out.println("Iguais, mesmo autor!");
        } else {
            System.out.println("hein!? Por que diferentes?");
        }

    }
}
