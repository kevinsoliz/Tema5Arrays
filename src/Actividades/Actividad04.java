package Actividades;

public class Actividad04 {
    public static void main(String[] args) {
        int[] miArry = { 1, 2, 3, 4, 5, 6, 7, 8, 9,10 };
        incrementarEn5(miArry); //no hace falta almacenar el nuevo array porque sigue siendo el mismo.
        imprimirArry(miArry);

    }

    static int[] incrementarEn5(int[] arry){
        for (int i = 0; i < arry.length; i++){
            arry[i] = arry[i] + 5;
        }
        return arry;
    }
    static void imprimirArry(int[] arry){
        for (int element : arry){
            System.out.print(element + " ");
        }
    }
}
