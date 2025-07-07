package Examen;

import Actividades.Actividad06;

import java.util.Scanner;

public class Ejer6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte longitud = (byte)(Actividad06.pedirValor("Introduce un número: ", sc));
        int[] enteros = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            enteros[i] = Actividad06.pedirValor("Introduce otro numero: ", sc);
        }

        int pares = 0;
        int impares = 0;
        int ceros = 0;

        for (int elemento : enteros) {
            if (elemento == 0)
                ceros++;
            else if (elemento % 2 == 0)
                pares++;
            else
                impares++;
        }

        double mediaPares = pares > 0 ? (double) enteros.length / pares : 0;
        double mediaImpares = impares > 0 ? (double) enteros.length / impares : 0;

        System.out.println("Media pares: " + mediaPares);
        System.out.println("Media impares: " + mediaImpares);
        System.out.println("Número de ceros: " + ceros);

    }
}
