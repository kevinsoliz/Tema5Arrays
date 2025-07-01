package Actividades;

import java.util.Arrays;

public class Actividad05 {
    public static void main(String[] args) {
        short[] miArry = new short[10];
        for (int i = 0; i < miArry.length; i++) {
            miArry[i] = generarNum((byte) 1, (byte) 100);
        }
        System.out.println(Arrays.toString(miArry));
    }
    public static short generarNum(byte min, byte max) {
        return (short)(Math.random() * (max - min + 1) + min);
    }
}
