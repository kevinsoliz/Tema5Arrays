package Examen;

import Actividades.Actividad06;

import java.util.Scanner;

public class Ejer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(segundos(Actividad06.pedirValor("Dias: ", sc), Actividad06.pedirValor("Horas: ", sc), Actividad06.pedirValor("Minutos: ", sc)));
    }
    static int segundos(int dias, int horas, int minutos){
        return (dias * 24 * 60 * 60) + (horas * 60 * 60) + (minutos * 60);
    }
}
