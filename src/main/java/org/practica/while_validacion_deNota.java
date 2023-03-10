package org.practica;

import java.util.Scanner;

public class while_validacion_deNota {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nota;
        do {
            System.out.println("ingrese su nota");
             nota = teclado.nextInt();


        }
        while (nota > 20);
        System.out.println("su nota es " + nota);
    }
}
