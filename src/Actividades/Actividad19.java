package Actividades;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tus números favoritos: ");
        int[]favoritos = nuevoArraySinLimite(sc);
        Arrays.sort(favoritos);

        while(favoritos.length > 1) {
            int aleatorio1 = favoritos[generarAleatorio(favoritos.length)];
            int aleatorio2 = favoritos[generarAleatorio(favoritos.length)];
            int media = (aleatorio1 + aleatorio2) / 2;
            favoritos = Actividad18.borrarOrdenado(favoritos, aleatorio1);
            favoritos = Actividad18.borrarOrdenado(favoritos, aleatorio2);
            favoritos = Actividad15.insercionOrdenada(favoritos, media);
        }
        System.out.println("Tu número de la suerte es: " + Arrays.toString(favoritos));


    }

    static int[] nuevoArraySinLimite(Scanner sc) {
        int[] favoritos = new int[0];
        int elemento = Actividad06.pedirValor("Número: ", sc);

        while(elemento != -1){
            favoritos = Arrays.copyOf(favoritos, favoritos.length + 1);
            favoritos[favoritos.length - 1] = elemento;
            elemento = Actividad06.pedirValor("Número: ", sc);
        }
        return favoritos;
    }
    public static int generarAleatorio(int limite){
        return (int)(Math.random() * limite);
    }
}
