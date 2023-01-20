package org.practica;

import java.util.Scanner;

public class triangulo {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int base;
        int alt;

        System.out.println("cual es su base?");
        base = teclado.nextInt();
        System.out.println("cual es su altura?");
        alt = teclado.nextInt();

        int area = (base * alt) / 2;

        System.out.println("el area del triangulo es: " + area);

    }
}
