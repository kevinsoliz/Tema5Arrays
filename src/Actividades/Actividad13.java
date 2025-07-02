package Actividades;

import java.util.Arrays;

public class Actividad13 {
    public static void main(String[] args) {
        int[] base = { 2, 12, 3, 2, 5, 12};
        int[] sinRepetidos = sinRepetidos(base);
        System.out.println(Arrays.toString(sinRepetidos));
    }
    static int[] sinRepetidos(int[] original){
        int[] sinRepetidos = new int[0];

        byte contador = 0;
        byte indice = 0;
        while (contador < original.length){
            if(!estaDentro(sinRepetidos, original[contador])){
                sinRepetidos = Arrays.copyOf(original, sinRepetidos.length + 1);
                sinRepetidos[sinRepetidos.length - 1] = original[contador];
            }
            contador++;
        }




        return sinRepetidos;
    }
    static boolean estaDentro(int[] origen, int key){
        return Arrays.binarySearch(origen, key) >= 0;
    }
}
