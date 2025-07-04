package Actividades;

import java.util.Arrays;

public class Actividad22 {
    public static void main(String[] args) {
        int[][] array1 = new int[5][5];
        for (int n = 0; n < 5; n++) {
            for (int m = 0; m < 5; m++) {
                array1[n][m] = 10 * n + m;
            }
        }
        System.out.println(Arrays.deepToString(array1));
    }
}
