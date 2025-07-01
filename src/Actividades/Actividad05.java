package Actividades;

import java.util.Arrays;

public class Actividad05 {
    public static void main(String[] args) {
        short[] miArry = new short[10];
        short suma = 0;
        for (int i = 0; i < miArry.length; i++) {
            miArry[i] = generarNum((byte) 1, (byte) 100);
            suma += miArry[i];
        }
        System.out.println(Arrays.toString(miArry));
        System.out.println(suma);
    }
    public static short generarNum(byte min, byte max) {
        return (short)(Math.random() * (max - min + 1) + min);
    }
}
