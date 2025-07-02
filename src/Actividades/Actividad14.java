package Actividades;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] miArry = nuevoArray(Actividad06.pedirValor("Introduce longitud del array: ", sc), sc);
        int[] pares = new int[0];
        int[] impares = new int[0];

        for(int elemento: miArry){
            if (elemento % 2 == 0){
                pares = Arrays.copyOf(pares, pares.length + 1);
                pares[pares.length - 1] = elemento;
            }
            else {
                impares = Arrays.copyOf(impares, impares.length + 1);
                impares[impares.length - 1] = elemento;
            }
        }
        System.out.println("Original: " + Arrays.toString(miArry));
        System.out.println(Arrays.toString(pares));
        System.out.println(Arrays.toString(impares));
    }
    public static int[] nuevoArray(int n, Scanner sc){
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = Actividad06.pedirValor("Elemento: ", sc);
        }
        return array;
    }

}
