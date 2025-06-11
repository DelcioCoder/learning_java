public class Aluno {
    private String nome;
    private int matricula;
    private int nota;

    public Aluno(String nome, int matricula, int nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    public void aprovado() {
        if(this.nota >= 7) {
            System.out.println("Aluno aprovado!");
        }
    }

    public void exibirDados() {
        System.out.println("Todos os dados do aluno: " + this.nome + " " + this.matricula + " " + this.nota);
    }
}
