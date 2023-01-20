package org.practica;

import java.util.Scanner;

public class sueldo {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int dinhora;
        int horas;
        int dias;

        System.out.println("cuanto ganas por hora?");
        dinhora = teclado.nextInt();
        System.out.println("cuantas horas has trabajas?");
        horas = teclado.nextInt();
        System.out.println("cuantos dias has trabajado?");
        dias = teclado.nextInt();

        int sueldo = dinhora * horas * dias;

        System.out.println("tu sueldo es de: " + sueldo);

    }
}
