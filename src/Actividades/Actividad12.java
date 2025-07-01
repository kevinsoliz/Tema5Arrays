package Actividades;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ganadora = { 23, 53, 12, 32, 43, 2};
        int[] primitiva = new int[6];
        for (int i = 0; i < ganadora.length; i++) {
            primitiva[i] = Actividad06.pedirValor("Número: ", sc);
        }

        System.out.println("Aciertos: " + verificarNumAciertos(ganadora, primitiva));
    }
    static byte verificarNumAciertos(int[] primitiva, int[] ganadora) {
        byte aciertos = 0;
        for (int num : ganadora) {
            if (Arrays.binarySearch(primitiva, num) >= 0)
                aciertos++;
        }
        return aciertos;
    }
}
