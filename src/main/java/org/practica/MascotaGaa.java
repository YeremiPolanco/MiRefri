package org.practica;

import javax.swing.*;

public class MascotaGaa {
    String nombre;
    String dueño;
    String raza;
    String color;

    public MascotaGaa(String dueño) {
        this.dueño = dueño;
    }

    public MascotaGaa(String raza, String color) {
        this.raza = raza;
        this.color = color;
    }

    public void jugar(){
        JOptionPane.showMessageDialog(null, "Estoy juegando xd");
    }
    public void comer(){
        JOptionPane.showMessageDialog(null, "Estoy cemiendo xd");
    }
    public void dormir(){
        JOptionPane.showMessageDialog(null, "Estoy jateando zzz");
    }
}
