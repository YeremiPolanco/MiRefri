package org.practica;

import javax.swing.*;

public class robot {
    public static void main(String[] args) {
        RobotCl robot01 = new RobotCl();
        int respuesta;
        String nombre2 = null;
        robot01.setNombre("Robotin");
        robot01.setCreador("Yeremi Zucaritas");
        robot01.setCodigo("XLR8");

        robot01.servir();

        respuesta = JOptionPane.showConfirmDialog(null, "le gusto el café?, creador " + robot01.getCreador());
        if (respuesta == 0) {
            robot01.bailar();
        } else {

            nombre2 = JOptionPane.showInputDialog("Dejaré de ser " + robot01.getNombre() + ". Que nombre desea para el robot " + robot01.getCodigo());
            robot01.cambiar(nombre2);
            JOptionPane.showMessageDialog(null, "Mi nuevo nombre es " + robot01.getNombre());

        }
    }
}
