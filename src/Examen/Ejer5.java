package Examen;

import Actividades.Actividad06;

import java.util.Scanner;

public class Ejer5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(esHasard(Actividad06.pedirValor("Introduce un número: ", sc)));
    }

    static boolean esHasard(int n){
        int divisor = n;
        int suma = 0;

        while(divisor > 9 && n > 0){
            int digito = n % 10;
            suma += digito;
            n = n / 10;
        }

        return divisor > 9 && divisor % suma == 0;
    }
}
