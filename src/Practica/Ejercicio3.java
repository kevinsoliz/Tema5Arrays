package Practica;

import Actividades.Actividad11;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] sueldos = new double[0];

        double sueldo = pedirValor("Sueldo: ", sc);
        while (sueldo != -1) {
            sueldos = Arrays.copyOf(sueldos, sueldos.length + 1);
            sueldos[sueldos.length - 1] = sueldo;
            sueldo = pedirValor("Sueldo: ", sc);
        }
        Arrays.sort(sueldos);

        double total = 0;
        for (int i = sueldos.length - 1; i >= 0; i--) {
            System.out.println(sueldos[i]);
            total += sueldos[i];
        }
        System.out.println("Sueldo máximo: " + NumberFormat.getCurrencyInstance(Locale.FRANCE).format(sueldos[sueldos.length - 1]));
        System.out.println("Sueldo mínimo: " + NumberFormat.getCurrencyInstance(Locale.FRANCE).format(sueldos[0]));
        System.out.println("Media: " + NumberFormat.getCurrencyInstance(Locale.FRANCE).format((total / sueldos.length)));
    }

    static double pedirValor(String prompt, Scanner sc) {
        double valor = 0;
        while (true) {
            try {
                System.out.print(prompt);
                valor = sc.useLocale(Locale.US).nextDouble();
                break;
            } catch (InputMismatchException e) {
                sc.next();
                System.out.println("Valor inválido.");
            }
        }
        return valor;
    }

}
