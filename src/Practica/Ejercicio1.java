package Practica;

import Actividades.Actividad08;
import Actividades.Actividad11;
import Actividades.Actividad18;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int[] enteros = {1, 2, 3, 4, 4, 4, 7, 8, 4, 4};
        int[] indicesRepetidos = buscarTodos(enteros, 4);
        System.out.println(Arrays.toString(indicesRepetidos));
    }
    static int[] buscarTodos(int[] original, int clave){

        int[] resultado = new int[0];

        int indice = buscar(original, clave);
        int max = 0;

        while(indice >= max){
            resultado = Arrays.copyOf(resultado, resultado.length + 1);
            resultado[resultado.length - 1] = indice;

            max = indice + 1;
            indice = buscar(original, clave);
        }

        return resultado;
    }

    public static int buscar(int[] a, int key) {
        int indice = -1;
        int contador = a.length - 1;
        while (contador >= 0) {
            if (a[contador] == key)
                indice = contador;
            contador--;
        }
        return indice;
    }
}
