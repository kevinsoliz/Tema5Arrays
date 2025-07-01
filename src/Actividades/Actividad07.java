package Actividades;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Actividad07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] miArry = new double[5];
        miArry[0] = 3.4;
        for(int i = 0; i < 5; i++){
            miArry[i] = pedirValorDecimal("Introduce un número: ", sc);
        }
        System.out.println(Arrays.toString(miArry));
    }
    public static double pedirValorDecimal(String prompt, Scanner sc) {
        double valor = 0;
        while(true){
            try {
                System.out.print(prompt);
                valor = sc.nextDouble();
                break;
            } catch (InputMismatchException e){
                sc.nextLine();
                System.out.println("Valor no válido.");
            }
        }
        return valor;
    }
}
