package Practica;

import java.util.Arrays;

public class FisherYates {
    public static void main(String[] args) {
        int[] arry = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        arry = desordenar(arry);
        System.out.println(Arrays.toString(arry));
    }
    static int[] desordenar(int[] base){
        for (int i = base.length - 1; i > 0; i--) {
            int aleatorio = (int)(Math.random() * (i + 1));

            int guardado = base[i];
            base[i] = base[aleatorio];
            base[aleatorio] = guardado;
        }
        return base;
    }
}
