package org.practica;

import java.util.Scanner;

public class temporada {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String mes;

        System.out.println("en que mes estamos?");
        mes = teclado.next();

        if (mes.equals("enero")){
            System.out.println("es verano");
        }
        else {
            if (mes.equals("febrero")){
                System.out.println("es verano");
            }
            else {
                if (mes.equals("marzo")){
                    System.out.println("es otoño");
                }
                else {
                    if (mes.equals("abril")){
                        System.out.println("es otoño");
                    }
                    else {
                        if (mes.equals("mayo")){
                            System.out.println("es otoño");
                        }
                        else {
                            if (mes.equals("jumio")){
                                System.out.println("es invierno");
                            }
                            else {
                                if (mes.equals("julio")){
                                    System.out.println("es invierno");
                                }
                                else {
                                    if (mes.equals("agosto")){
                                        System.out.println("es invierno");
                                    }
                                    else {
                                        if (mes.equals("septiembre")){
                                            System.out.println("es primavera");
                                        }
                                        else {
                                            if (mes.equals("octubre")){
                                                System.out.println("es primavera");
                                            }
                                            else {
                                                if (mes.equals("noviembre")){
                                                    System.out.println("es primavera");
                                                }
                                                else {
                                                    if (mes.equals("diciembre")){
                                                        System.out.println("es verano");
                                                    }
                                                    else {
                                                        System.out.println("error 504");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }
}