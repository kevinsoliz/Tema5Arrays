package Actividades;

import java.util.Scanner;

public class Actividad08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] enteros = new int[Actividad06.pedirValor("Introduce una cantidad: ", sc)];
        for(int i = 0; i < enteros.length; i++){
            enteros[i] = Actividad06.pedirValor("Introduce un entero: ", sc);
        }
        for (int i = enteros.length - 1; i >= 0; i--) {
            System.out.print(enteros[i] + " ");
        }
    }
}
