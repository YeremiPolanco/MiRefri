package org.practica;

import java.util.Scanner;

public class grafico {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("cuantas filas va tener?");
        int filas = teclado.nextInt();

        String n1 = " ";
        String n2 = "*";

        for (int i = 0; i < 20; i++){
            if (filas <= 20)
                System.out.print(n2);

        }

    }
}
