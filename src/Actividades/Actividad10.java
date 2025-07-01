package Actividades;

import java.util.Arrays;

public class Actividad10 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(rellenaParPro(10,20)));
    }
    static int[] rellenaPares(byte longitud, short fin){
        int[] respuesta = new int[longitud];
        for (int i = 0; i<longitud; i++){
            int par = Actividad05.generarNum((byte) 2, (byte)fin);
            if(par % 2 == 0)
                respuesta[i] = par;
            else
                i--;
        }
        return respuesta;
    }
    static Integer[] rellenaParPro(int longitud, int fin){
        Integer[] respuesta = new Integer[longitud];
        int cantidadNumeros = 0;

        while(cantidadNumeros < longitud){
            int par = Actividad05.generarNum((byte) 2, (byte)fin);
            if(par % 2 == 0){
                respuesta[cantidadNumeros] = par;
                cantidadNumeros++;
            }
        }
        return respuesta;
    }
}

