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


    public static int[] buscarTodos(int[] original, int key) {
        int[] resultado = new int[0];

        int contador = 0;
        while (contador < original.length) {
            if (original[contador] == key) {
                resultado = Arrays.copyOf(resultado, resultado.length + 1);
                resultado[resultado.length - 1] = contador;
            }
            contador++;
        }
        return resultado;
    }
}
