package Actividades;

import java.util.Arrays;

public class Actividad11 {
    public static void main(String[] args) {
        int[] enteros = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int posicion = Arrays.binarySearch(enteros, 4);
        System.out.println("Binary search: " + posicion);
        posicion = buscar(enteros, 0);
        System.out.println("Buscar : " + posicion);
    }
    static int buscar(int[] a, int key) {
        int indice = -1;
        int contador = 0;
        while (contador < a.length) {
            if (a[contador] == key)
                indice = contador;
            contador++;
        }
        return indice;
    }
}
