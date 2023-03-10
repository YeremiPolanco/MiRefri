package org.practica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listas2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("cantidad de notas: ");
        int n = teclado.nextInt();
        int m = 0;
        int suma = 0;
        List<Integer> lista = new ArrayList<>();

        for (int i = 0; i < n; i++){
            System.out.println("ingrese su nota: ");
            m = teclado.nextInt();
            lista.add(m);
        }
            System.out.println(lista);
        for (int i = 0; i < n; i++){
            suma += lista.get(i);
        }

        int promedio = suma / n;
        lista.add(promedio);
        System.out.println(lista);

    }
}
