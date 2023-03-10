package org.practica;

import sun.awt.windows.WPrinterJob;

import java.util.Scanner;

public class promedio_1 {
    public static void main(String[] args) {
        System.out.print("ingrese la cantidad de notas: ");
        Scanner teclado = new Scanner(System.in);

        int n1 = teclado.nextInt();
        int nota[] = new int[n1];
        int promedio;
        int suma = 0;
        for (int i = 0; i < n1; i ++) {

                System.out.println("Cual es tu nota:");
                nota[i] = teclado.nextInt();
        }
        for (int i = 0; i < n1; i ++){

            suma = suma + nota[i];

        }
        promedio = suma / n1;
        System.out.println("tu promedio final es: " + promedio);
        if (promedio >= 17){
            System.out.println("aprobaste bien :)) ");
        }
        else if (promedio >= 13) {
            System.out.println("aprobaste maso");
        }
        else {
            System.out.println("jalaste por burro");
        }
    }
}
