package org.practica;

import java.util.Scanner;

public class perimetro {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int lado;

        System.out.println("cual es el lado de su cuadrado?");
        lado = teclado.nextInt();
        int peri = lado * 4;

        System.out.println("su perimetro es: " + peri);

    }
    }
