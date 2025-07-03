package Actividades;

import java.util.Arrays;

public class Actividad20 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(array1 == array2); //Da false porque estás comparando referencias de memoria.
        System.out.println(Arrays.equals(array1, array2)); //Ahora sí da true.
    }
}
