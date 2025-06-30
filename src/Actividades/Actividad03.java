package Actividades;

import java.util.Arrays;

public class Actividad03 {
    public static void main(String[] args) {
        int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] copia = new int[original.length + 1];
        copia[0] = original[0];
        copia[1] = original[1];
        copia[2] = original[2];
        copia[3] = original[3];
        copia[4] = original[4];
        copia[5] = original[5];
        copia[6] = original[6];
        copia[7] = original[7];
        copia[8] = original[8];
        copia[9] = original[9];
        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(copia));
    }
}
