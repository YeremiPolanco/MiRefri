package org.practica;

import javax.swing.*;

public class gaaa {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Como te llamass?");
        JOptionPane.showMessageDialog(null,"Hola, " + nombre);
        int respuesta = JOptionPane.showConfirmDialog(null, "quieres programal con dalto?");
        JOptionPane.showMessageDialog(null, respuesta);

        MascotaGaa animal = new MascotaGaa("dueñito");
        animal.color = "rojo";
        animal.dueño = "yo";
        animal.nombre = "solovino";
        animal.dormir();

        JOptionPane.showMessageDialog(null, "soy de de color " + animal.color);
    }
    private static String decirHola(){
        return "hola";
    }
}



