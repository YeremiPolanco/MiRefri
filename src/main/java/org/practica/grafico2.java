package org.practica;

import java.util.Scanner;

public class grafico2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int filas;

        do {
            System.out.println("intruduce el numero de las filas");
            filas = teclado.nextInt();
        }
        while (filas > 20 || filas < 2);

        for (int alt = 1; alt <= filas; alt++) {
            //blancos
            for (int blan = 1; blan <= filas - alt; blan++) {
                System.out.print(" ");
            }
            //asteriscos
            for (int ast = 1; ast <= (alt * 2) - 1; ast++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
