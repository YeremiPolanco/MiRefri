package org.practica;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class RobotCl {
    private String nombre;
    private String creador;
    private String codigo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "RobotCl{" +
                "nombre='" + nombre + '\'' +
                ", creador='" + creador + '\'' +
                ", codigo='" + codigo + '\'' +
                '}';
    }

    public void servir(){
        JOptionPane.showMessageDialog(null, "Buenos días creador " + creador);
        JOptionPane.showMessageDialog(null, "Le serviré su café");

    }
    public void bailar(){
        JOptionPane.showMessageDialog(null, "Estoy bailando de la emoción, Gracias");
    }
    public void cambiar(String nombre2){
        JOptionPane.showMessageDialog(null, "Por depresión cambiaré mi nombre ");
        nombre = nombre2;
    }
}
