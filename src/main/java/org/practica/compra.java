package org.practica;

import java.util.Scanner;

public class compra {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String producto;
        int precio;
        int cantidad;

        System.out.println("que producto desea comprar?");
        producto = teclado.next();
        System.out.println("cual es su precio?");
        precio = teclado.nextInt();
        System.out.println("cuantos desea comprar?");
        cantidad = teclado.nextInt();

        int costo = precio * cantidad;
        System.out.println("por la compra de su " + producto + " su costo total sera de: " + costo);

    }
}
