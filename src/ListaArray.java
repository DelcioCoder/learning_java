import java.util.ArrayList;
public class ListaArray {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        for(int i = 0; i < 100; i++) {
            if( i % 2 == 0) {
                numeros.add(i);
            }
        }
        System.out.println(numeros);

    }
}
