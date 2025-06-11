public class MaxValue {
    public static void main(String[] args) {
        int[] numeros = {200, 1, 2, 3, 4,1000, 5, 300};
        int maior = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        System.out.println("O maior número do Array é " + maior);
    }
}