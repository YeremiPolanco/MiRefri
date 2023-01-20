package org.practica;

import java.util.Scanner;

public class operaciones {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n1;
        int n2;

        System.out.println("cual es el numero 1?");
        n1 = teclado.nextInt();
        System.out.println("cual es el numero 2?");
        n2 = teclado.nextInt();

        int suma = n1 + n2;
        int resta = n1 - n2;
        int multi = n1 * n2;
        int divi = n1 / n2;

        System.out.println("la suma es: " + suma);
        System.out.println("la resta es: " + resta);
        System.out.println("la multiplicacion es: " + multi);
        System.out.println("la division es: " + divi);

    }
}
