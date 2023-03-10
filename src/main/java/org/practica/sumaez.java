package org.practica;

import java.util.Scanner;

public class sumaez {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite de cuantas cifras sera su suma:");
        int n1 = teclado.nextInt();
        int suma = 0;

        for (int i = 0; i < n1; i++) {
            System.out.println("diga un número para sumarlo");
            suma = suma + teclado.nextInt();
        }

        System.out.println("su suma total es de: " + suma);
    }
}