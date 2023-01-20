package org.practica;

import java.util.Scanner;

public class trapecio {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int base_mayor;
        int base_menor;
        int altura;

        System.out.println("digite la base mayor");
        base_mayor = teclado.nextInt();
        System.out.println("digite la base menor");
        base_menor = teclado.nextInt();
        System.out.println("digite su altura");
        altura = teclado.nextInt();

        int area = ((base_mayor + base_menor) * altura)/2;
        System.out.println("el area del trapecio es: " + area);

    }
}
