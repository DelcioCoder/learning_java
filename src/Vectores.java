import java.util.Arrays;

public class Vectores {
    public static void main(String[] args) {
        int [] numeros = {200,1,2,3,4,5, 300};
        if(Arrays.stream(numeros).max().getAsInt() == 200) {
            System.out.println("O maior número do Array é o numero 200");
        } else {
            System.out.println("O maior número do Array é " + Arrays.stream(numeros).max().getAsInt());
        }
    }
}
