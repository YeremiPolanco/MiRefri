package org.practica;

import java.util.ArrayList;
import java.util.List;

public class juego {
    public static void main(String[] args) {

        Bingo miBingo = new Bingo();
        int cantidad_encontrada = 0;
        while (cantidad_encontrada == 0) {
            miBingo.llenarBolillas();
            miBingo.obtenerNumerosGanadores();
            miBingo.generarCartilla();
            miBingo.generarMenu();
            miBingo.agregarBolillaExtra();
            miBingo.encontrarAciertos();
            cantidad_encontrada = miBingo.generarPremio();
        }
    }
}
