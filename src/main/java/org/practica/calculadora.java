package org.practica;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double n1;
        double n2;

        String operador;

        double suma;
        double resta;
        double multi;
        double divi;
        double pote;
        double raiz;

        System.out.println("que operdor desea utilizar?");
        operador = teclado.next();

        System.out.println("cual es la primera cifra: ");
        n1 = teclado.nextInt();
        System.out.println("cual es la segunda cifra: ");
        n2 = teclado.nextInt();

        if (operador.equals("suma") ){
            suma = n1 + n2;
            System.out.println(suma);
        }
        else {
            if (operador.equals("resta")){
                resta = n1 - n2;
                System.out.println(resta);
            }
            else {
                if (operador.equals("multiplicacion")){
                    multi = n1 * n2;
                    System.out.println(multi);
                }
                else {
                    if (operador.equals("division")){
                        divi = n1 / n2;
                        System.out.println(divi);
                    }
                    else {
                        if (operador.equals("potenciacion")){
                            pote = Math.pow(n1, n2);
                            System.out.println(pote);
                        }
                        else {
                            if (operador.equals("raiz")){
                                raiz = Math.pow(n1, 1/n2);
                                System.out.println(raiz);

                            }
                        }
                    }
                }
            }
        }



    }
}
