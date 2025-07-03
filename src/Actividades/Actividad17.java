package Actividades;

import java.util.Arrays;

public class Actividad17 {
    public static void main(String[] args) {
        int[] arry = {1, 3, 2, 13, 34};
        arry = eliminarMayores(arry, 10);
        System.out.println(Arrays.toString(arry));
    }
    static int[] eliminarMayores(int[] original, int valor) {
        int[] copia = new int[0];
        for (int elemento : original)
            if (elemento < valor) {
                copia = Arrays.copyOf(copia, copia.length + 1);
                copia[copia.length - 1] = elemento;
            }
        return copia;
    }
}
