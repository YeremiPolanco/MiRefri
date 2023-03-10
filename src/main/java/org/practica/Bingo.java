package org.practica;

import java.util.ArrayList;
import java.util.List;

public class Bingo {
    List<Integer> numeros_totales = new ArrayList<>();
    List<Integer> numeros_ganadores = new ArrayList<>();
    List<Integer> tu_cartilla = new ArrayList<>();
    List<Boolean> aciertos = new ArrayList<>();
    public void llenarBolillas(){
        for (int i = 1; i < 61; i++) {
            numeros_totales.add(i);
        }

    }
    public void obtenerNumerosGanadores(){
        for (int i = 0; i < 20; i++) {
            double r1 = Math.random() * 60 + 1;
            numeros_ganadores.add((int) r1);
        }
    }
    public void generarCartilla(){
        for (int i = 0; i < 15; i++) {
            double r1 = Math.random() * 60 + 1;
            tu_cartilla.add((int) r1);
        }
    }
    public int generarPremio(){
        int suma = 0;
        int cantidad_encontrada = 0;
        for (int i = 0; i < tu_cartilla.size(); i++) {
            int numero_tu_cartilla = tu_cartilla.get(i);
            suma += numero_tu_cartilla;
        }
        int promedio = suma / tu_cartilla.size();
        for (int i = 0; i < aciertos.size(); i++) {
            boolean acierto = aciertos.get(i);
            if (acierto == true) {
                cantidad_encontrada += 1;
            }
        }
        System.out.println(promedio);
        System.out.println(aciertos);
        if (cantidad_encontrada >= 7) {
            System.out.println("ganaste");
            if (promedio >= 30) {
                System.out.println("GANO PREMIO 1");
            } else if (promedio >= 20) {
                System.out.println("GANO PREMIO 2");
            } else {
                System.out.println("GANO PREIMO 3");
            }
        } else {
            System.out.println("perdiste juega de nuevo gaaaa");
        }
        System.out.println(cantidad_encontrada);
        return cantidad_encontrada;
    }
    public void encontrarAciertos(){
        for (int i = 0; i < tu_cartilla.size(); i++) {

            boolean encontro = numeros_ganadores.contains(tu_cartilla.get(i));
            aciertos.add(encontro);
        }
    }
    public void agregarBolillaExtra(){
        int suma_de_ganadores = 0;
        for (int i = 0; i < numeros_ganadores.size(); i++) {
            int numero_ganador = numeros_ganadores.get(i);
            suma_de_ganadores += numero_ganador;
        }
        if (suma_de_ganadores < 250) {
            numeros_ganadores.add((int) Math.random() * 60 + 1);
        }
        System.out.println("SUMA DE NÚMEROS: " + suma_de_ganadores);
    }
    public void generarMenu(){
        System.out.println("NÚMEROS TOTALES DEL BINGO:");
        System.out.println(numeros_totales);
        System.out.println("NÚMEROS GANADORES:");
        System.out.println(numeros_ganadores);
        System.out.println("NÚMEROS DE TU CARTILLA:");
        System.out.println(tu_cartilla);
        System.out.println("PREMIO 1(30): PELUCHE GRANDE");
        System.out.println("PREMIO 2(20): PELUCHE MEDIANO");
        System.out.println("PREMIO 3(10): PELUCHE PEQUEÑO");
    }
}
