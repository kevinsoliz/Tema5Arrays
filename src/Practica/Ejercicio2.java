package Practica;

import Actividades.Actividad11;
import Actividades.Actividad13;
import Actividades.Actividad15;

import java.util.Arrays;

public class Ejercicio2 {
    public static void main(String[] args) {
        int[] original = {11, 22, 33, 44, 55, 66, 77, 88, 99, 100};
        original = desordenar(original);
        System.out.println(Arrays.toString(original));


    }
    static int[] desordenar(int[] original){
        int[] desordenado = new int[original.length];
        int[] indicesAleaotorios = arrayAleatorios(original.length);

        for(int i = 0; i < original.length; i++){
            desordenado[i] = original[indicesAleaotorios[i]];
        }
        return desordenado;
    }


    static int[] arrayAleatorios(int longitud){
       int [] arrayAleatorios = new int[0];
       int contador = 0;
       while(contador < longitud){
           int aleaotorio =  (int) (Math.random() * longitud);
           if(!estaDentro(arrayAleatorios, aleaotorio)){
               arrayAleatorios = Arrays.copyOf(arrayAleatorios, arrayAleatorios.length + 1);
               arrayAleatorios[arrayAleatorios.length - 1] = aleaotorio;
               contador++;
           }

       }
       return arrayAleatorios;
    }


    static boolean estaDentro(int[]arry, int valor){
        boolean dentro = false;
        for(int elemento : arry){
            if(elemento == valor)
                dentro = true;
        }
        return dentro;
    }


}
