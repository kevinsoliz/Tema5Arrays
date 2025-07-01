package Actividades;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Actividad06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte n = (byte)(pedirValor("Introduce un número: ", sc));
        short[] miArry = new short[n];

        for(int i = 0; i < n; i++){
            miArry[i] = (short)(pedirValor("Otro número más: ", sc));
        }

        byte positivos = 0;
        byte negativos = 0;
        byte ceros = 0;

        for (short elemento : miArry) {
            if (elemento > 0)
                positivos += elemento;
            else if  (elemento < 0)
                negativos += elemento;
            else
                ceros++;
        }

        System.out.println("Media positivos: " + positivos/n );
        System.out.println("Media negativos: " + negativos/n );
        System.out.println("Número de ceros: " + ceros);


    }
    public static int pedirValor(String prompt, Scanner sc) {
        int valor = 0;
        while (true) {
            try {
                System.out.print(prompt);
                valor = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                sc.next();
                System.out.println("Valor no válido.");
            }
        }
        return valor;
    }
}
