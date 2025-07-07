package Examen;

import java.util.Arrays;

public class Ejer8 {
    public static void main(String[] args) {
        int[] miArry = {10, 1, 5, 8, 9, 2};
        miArry = suma(miArry, 3);
        System.out.println(Arrays.toString(miArry));
    }
    static int[] suma(int[] base, int numElementos){
        int[] suma = new int[base.length - numElementos + 1];
        int sumaBase = 0;
        for (int i = 0; i < suma.length; i++){
            for (int k = i; k < numElementos + i; k++){
                sumaBase += base[k];
                suma[i] = sumaBase;
            }
            sumaBase = 0;
        }
        return suma;
    }
}
