package Practica;

import Actividades.Actividad06;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] bidi = new int[5][3]; //5 filas por 3 columnas,
        for (int k = 0; k < bidi.length; k++) {
            for (int j = 0; j < bidi[k].length; j++) {
                bidi[k][j] = (int)(Math.random() * 11);
                System.out.print(bidi[k][j] + "   ");
            }
            System.out.println();
        }
        System.out.println();
        int total = 0;
        for (int k = 0; k < 3; k++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(bidi[j][k] + "  ");
                total += bidi[j][k];

            }
            System.out.print("Media " + (k + 1) + " trimestre: " + (total / 5));
            System.out.println();
            total = 0;
        }

        int posicionAlumno = Actividad06.pedirValor("Posición del alumno: ", sc);
        for (int i = 0; i < 3; i++) {
            total += bidi[posicionAlumno - 1][i];
        }
        System.out.println("Media del alumno " + posicionAlumno + ": " + (total / 3) );


    }
}
