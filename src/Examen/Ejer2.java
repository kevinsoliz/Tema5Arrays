package Examen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(distancia(pedirDouble("x1: ", sc), pedirDouble("y1: ", sc), pedirDouble("x2: ", sc), pedirDouble("y2: ", sc)));
    }
    static double distancia(double x1, double y1, double x2, double y2){
        double diferenciaX = Math.pow(x1 - x2, 2);
        double diferenciaY = Math.pow(y1 - y2, 2);
        return Math.sqrt(diferenciaX + diferenciaY);
    }
    public static double pedirDouble(String prompt, Scanner sc){
        double valor = 0;
        while(true){
            try {
                System.out.print(prompt);
                valor = sc.nextDouble();
                break;
            } catch (InputMismatchException e){
                sc.next();
                System.out.println("Valor inválido.");
            }
        }
        return valor;
    }
}
