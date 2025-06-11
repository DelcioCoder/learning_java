public class Pessoa {
    private String nome;
    private int  idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    // métodos (comportamentos)
    public void apresentar() {
        System.out.println("Olá! Eu sou o " + nome + " e tenho " + idade + " anos.");
    }

    // getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade > 0) {
            this.idade = idade;

        }
    }
}