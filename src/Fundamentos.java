public class Fundamentos {
    public static void main(String[] args) {
        // Variaveis
        int idade = 38;
        double altura = 1.75;
        boolean isStudent = true;


        // Controle de fluxo
        if (idade >= 18 && isStudent) {
           System.out.println("Adulto estudante");
        };

        for (int i = 0; i<=5; i++) {
            System.out.println("Contagem:" + i);
        }
    }
}
