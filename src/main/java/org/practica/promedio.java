package org.practica;

import java.util.Scanner;

public class promedio {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int mate;
        int comu;
        int ct;
        int ccss;
        int reli;


        System.out.println("cual es su nota de matematicas?");
        mate = teclado.nextInt();
        System.out.println("cual es su nota de comunicacion?");
        comu = teclado.nextInt();
        System.out.println("cual es su nota de ciencias?");
        ct = teclado.nextInt();
        System.out.println("cual es su nota de ccss?");
        ccss = teclado.nextInt();
        System.out.println("cual es su nota de religion?");
        reli = teclado.nextInt();


        int promedio = (mate + comu + ct + ccss + reli) / 5;
        System.out.println("tu promedio final es: " + promedio);

        if (promedio <= 13 ){
            System.out.println("estas desaprobado :(");
        }
        else {
            System.out.println("estas aprobado ;)");
        }

    }
}
