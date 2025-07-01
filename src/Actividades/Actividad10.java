package Actividades;

import java.util.Arrays;

public class Actividad10 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(rellenaPares((byte) 10, (short) 20)));
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
}

