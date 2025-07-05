package Examen;

import Actividades.Actividad06;

import java.util.Scanner;

public class Ejer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(padovan(Actividad06.pedirValor("Posición: ", sc)));

    }
    static int padovan(int posicion){
        int resultado = 1;
        if(posicion == 0 || posicion == 1 || posicion == 2)
            resultado = 1;
        else
            resultado = padovan(posicion - 2) + padovan(posicion - 3);
        return resultado;
    }
}
