package Examen;

import Actividades.Actividad06;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class Ejer7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] impares = rellenaImpares(Actividad06.pedirValor("Introduce un número: ", sc), Actividad06.pedirValor("Introduce otro más: ", sc));
        Arrays.sort(impares);
        System.out.println(Arrays.toString(impares));
    }
    static int[] rellenaImpares(int longitud, int fin){
        int[] impares = new int[longitud];
        byte contador = 0;

        while(contador < longitud){
            int impar = (int)(Math.random()*fin + 1);
            if (impar % 2 == 1) {
                impares[contador] = impar;
                contador++;
            }
        }
        return impares;
    }

}
