public class TestePessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Delcio", 22);
        Pessoa p2 = new Pessoa("Maria", 20);
        p1.apresentar();
        p2.apresentar();

        // usando getters e setters
        p1.setIdade(25);
        System.out.println("Nova idade de " + p1.getNome() + ": " + p1.getIdade());
    }
}
