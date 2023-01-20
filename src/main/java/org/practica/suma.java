package org.practica;

import java.util.Scanner;

public class suma {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n1;
        int n2;
        int n3;

        System.out.println("ingresa el numero 1");
        n1 = teclado.nextInt();
        System.out.println("ingresa el numero 2");
        n2 = teclado.nextInt();
        System.out.println("ingresa el numero 3");
        n3 = teclado.nextInt();

        int suma = n1 + n2 + n3;
        System.out.println("la suma es: " + suma);



    }
}
