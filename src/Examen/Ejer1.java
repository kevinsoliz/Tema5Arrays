package Examen;

import Actividades.Actividad06;

import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Radio: ");
        double radio = sc.nextDouble();
        superficieVolumen(radio);
    }
    static void superficieVolumen(double radio){
        double superficie = 4 * Math.PI * Math.pow(radio, 2);
        double area = 4 * Math.PI / 3 * Math.pow(radio, 3);
        System.out.println("Superficie: " + superficie
                            + "\nVolumen: " + area);
    }
}
