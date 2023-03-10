package org.practica;

import java.util.Scanner;

public class ajedrez {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("ingrese un digito para n");
        int n1 = teclado.nextInt();

        for (int i = 0; i < n1; i++){
            System.out.println(i);
        }

    }
}

