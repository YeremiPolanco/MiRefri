package org.practica;

import java.util.Scanner;

public class residuo {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n1;
        int n2;

        System.out.println("ingresa n1");
        n1 = teclado.nextInt();
        System.out.println("ingresa n2");
        n2 = teclado.nextInt();

        int residuo = n1 % n2;

        System.out.println(residuo);
    }
}
