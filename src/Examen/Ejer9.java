package Examen;

import java.util.Arrays;

public class Ejer9 {
    public static void main(String[] args) {
        int[] enteros = {1, 2, 3, 5};
        enteros = insercionOrdenada(enteros, 4);
        System.out.println(Arrays.toString(enteros));

    }
    static int[] insercionOrdenada(int[] base, int newElemento){
        base = Arrays.copyOf(base, base.length + 1);
        int indice = Arrays.binarySearch(base, newElemento);
        if(indice < 0){
            indice = -indice - 1;
            System.arraycopy(base, indice, base, indice + 1, base.length - indice - 1);
            base[indice] = newElemento;
        }
        return base;
    }
}
