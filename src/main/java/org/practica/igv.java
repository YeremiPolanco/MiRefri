package org.practica;

import java.util.Scanner;

public class igv {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double monto;
        double igv;
        double total;

        System.out.println("ingrese monto de venta");
        monto = teclado.nextDouble();
        igv = monto * (0.19);
        System.out.println("el igv es: " + igv);
        total = monto + igv;
        System.out.println("el valor total de venta es de " + total);


    }
}
