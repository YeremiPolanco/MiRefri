package org.practica;

import java.util.Scanner;

public class sign_in {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //mis datos
        String user = "Yeremi";
        String contra = "Najaag123";

        System.out.println("Cual es su nombre de usuario: ");
        String user2 = teclado.nextLine();
        System.out.println("Cual es su contraseña: ");
        String contra2 = teclado.nextLine();

        while (!user2.equals(user) || !contra2.equals(contra)){

            System.out.println("ingrese sus datos nuevamente");
            System.out.println("Cual es su nombre de usuario: ");
            user2 = teclado.next();
            System.out.println("Cual es su contraseña: ");
            contra2 = teclado.next();

        }
        System.out.println("---------------------------------------------------");
        System.out.println("BIENVENIDO " + user);
    }
}
