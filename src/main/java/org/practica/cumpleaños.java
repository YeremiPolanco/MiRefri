package org.practica;

import java.util.Scanner;

public class cumpleaños {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int factual;
        int fnacimineto;

        System.out.println("cual es el año actual?");
        factual = teclado.nextInt();
        System.out.println("cual es el año en el que nacio?");
        fnacimineto = teclado.nextInt();

        int edad = factual - fnacimineto;

        System.out.println("su edad es de " + edad + " años.");

    }
}
