package org.practica;

import com.sun.swing.internal.plaf.synth.resources.synth_sv;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);

       int lado;

        System.out.println("cual es el lado del cuadrado?");
        lado = teclado.nextInt();

        int area = lado * lado;

        System.out.println("el area del cuadrado es: " + area);

    }
}