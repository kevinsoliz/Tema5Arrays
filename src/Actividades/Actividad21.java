package Actividades;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] combinacionSecreta = combinacionSecreta(4);
        int[] combinacionUsuario = new int[combinacionSecreta.length];

        pedirCombinacion(combinacionUsuario, sc);

        while(!Arrays.equals(combinacionSecreta, combinacionUsuario)){
            byte i = 0;
            for (int elemento : combinacionUsuario) {
                System.out.println(verificar(combinacionSecreta[i], elemento));
                i++;
            }
            pedirCombinacion(combinacionUsuario, sc);
        }
        System.out.println("Todo correcto.");
    }

    private static void pedirCombinacion(int[] combinacionUsuario, Scanner sc) {
        for (int i = 0; i < combinacionUsuario.length; i++) {
            combinacionUsuario[i] = Actividad06.pedirValor("Digito: ", sc);
        }
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
        else 
            mensaje = "Correcto.";

        return mensaje;
    }
}
