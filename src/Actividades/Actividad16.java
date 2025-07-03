package Actividades;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] puntuaciones = new int[5];

        for(int i = 0; i < puntuaciones.length; i++){
            puntuaciones[i] = Actividad06.pedirValor("Puntuación: ", sc);
        }
        Arrays.sort(puntuaciones);

        System.out.println("Programadores de exposición:");
        int puntuacion = Actividad06.pedirValor("Puntuación: ", sc);

        while (puntuacion != -1){
            puntuaciones = Actividad15.insercionOrdenada(puntuaciones, puntuacion);
            puntuacion = Actividad06.pedirValor("Puntuación: ", sc);
        }
        System.out.println("Puntuaciones: " + Arrays.toString(puntuaciones));
    }
}
