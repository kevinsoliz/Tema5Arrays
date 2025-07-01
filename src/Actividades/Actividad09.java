package Actividades;

import java.util.Scanner;

public class Actividad09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] enteros = { 1, 2, 6, 1, 9, 2};
        System.out.println(maximo(enteros));
    }
    static int maximo(int[] t){
        int maximo = 0;

        for (int elemento : t){
            if (elemento > maximo){
                maximo = elemento;
            }
        }
        return maximo;
    }
}
