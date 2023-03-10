package org.practica;

import java.util.ArrayList;
import java.util.List;

public class listas {
    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();
        for (int i=0; i<2000; i += 2) {
            lista.add(i);
        }
        lista.remove(Integer.valueOf(1000));
        for (int i=0; i < lista.size(); i ++){
            System.out.println(lista.get(i));
        }
        System.out.println();
    }
}
