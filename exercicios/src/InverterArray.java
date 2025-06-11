public class InverterArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] arrayInvertido = Inverter.inverterArray(array);
        System.out.println("Array original: " + java.util.Arrays.toString(array));
        System.out.println("Array invertido: " + java.util.Arrays.toString(arrayInvertido));

    }
}

class Inverter {
    public static int[] inverterArray(int[] array) {
        int[] arrayInvertido = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayInvertido[i] = array[array.length - 1 - i];
        }
        return arrayInvertido;
    }

}
