package Actividades;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] combinacionSecreta = combinacionSecreta(4);

        for (int j : combinacionSecreta) {
            int digito = Actividad06.pedirValor("Digito: ", sc);

            while (j != digito) {
                System.out.println(verificar(j, digito));
                digito = Actividad06.pedirValor("Digito: ", sc);
            }
            System.out.println("Has acertado!");
        }

        System.out.println("Combinación secreta: " + Arrays.toString(combinacionSecreta));
    }

    static int[] combinacionSecreta(int digitos){
        int[] combinacion = new int[digitos];
        for(int i = 0; i < digitos; i++){
            combinacion[i] = (int)(Math.random() * 5 + 1);
        }
        return combinacion;
    }

    static String verificar(int digito, int inputUser){
        String mensaje = "";
        if ( digito > inputUser)
            mensaje = "Es mayor que " + inputUser;
        else if ( digito < inputUser)
            mensaje = "Es menor que " + inputUser;
        return mensaje;
    }
}
