package Actividades;

import java.util.Arrays;

public class Actividad15 {
    public static void main(String[] args) {
        int[] prueba = { 2, 3, 6, 7, 9};
        prueba = insercionOrdenada(prueba, 8);
        System.out.println(Arrays.toString(prueba));
    }
    public static int[] insercionOrdenada(int[] original, int nuevoElemento){
        int[] copia = new int[original.length + 1];

        int indiceInsercion = Arrays.binarySearch(original, nuevoElemento);
        if(indiceInsercion >= 0)
            copia = original;
        else
            indiceInsercion = -indiceInsercion - 1;

        System.arraycopy(original, 0, copia, 0, indiceInsercion);
        System.arraycopy(original, indiceInsercion, copia, indiceInsercion + 1, original.length - indiceInsercion);
        copia[indiceInsercion] = nuevoElemento;

        return copia;
    }
}
