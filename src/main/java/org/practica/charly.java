package org.practica;

import java.util.Scanner;

public class charly {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        char dig1;
        char dig2;

        System.out.println("cual es su primer caracter:");
        dig1 = teclado.next().charAt(0);
        System.out.println("cual es su segundo caracter:");
        dig2 = teclado.next().charAt(0);

        System.out.println(dig1 + " y " + dig2);
    }
}
