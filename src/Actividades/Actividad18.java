package Actividades;

import java.util.Arrays;

public class Actividad18 {
    public static void main(String[] args) {
        int[] enteros = {1, 3, 5, 6, 8};
        enteros = borrarOrdenado(enteros, 3);
        System.out.println(Arrays.toString(enteros));
    }
    public static int[] borrarOrdenado(int[] original, int borralo) {
        //int[] copia = Arrays.copyOf(original, original.length);
        int indice = Arrays.binarySearch(original, borralo);
        if (indice >= 0){
            //System.arraycopy(original, 0, copia, 0, indice);
            System.arraycopy(original, indice + 1, original, indice, original.length - indice - 1);
            original = Arrays.copyOf(original, original.length - 1);
        }
        return original;
    }
}
