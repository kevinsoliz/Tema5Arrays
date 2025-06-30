package Actividades;

public class Actividad02 {
    public static void main(String[] args) {
        boolean[] buleanos = new boolean[10];
        boolean[] buleria = buleanos;
        boolean[] salmonera = buleria;
        boolean[] imprenta = salmonera;

        System.out.println(buleanos);
        System.out.println(buleria);
        System.out.println(salmonera);
        System.out.println(imprenta);
    }
}
