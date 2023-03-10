package org.practica;

import java.util.Scanner;

public class damas_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String matriz[][] = new String[8][8];
        int pos_x = 0;
        int pos_y = 0;
        String dire;
        int new_pos_x1 = 0;
        int new_pos_y1 = 0;

        for (int i = 0; i < 8; i++){

            for (int j = 0; j < 8; j++){
                matriz[i][j] = " _ ";
            }
        }
        for (int i = 0; i < 5; i++){
            pos_x = (int) (Math.random()*8);
            pos_y = (int) (Math.random()*8);
            // x =  ○  && y = ●
            if (matriz[pos_x][pos_y].equals(" ○ ")){
                i--;
            }
            else {
                matriz[pos_x][pos_y] = " ○ ";
            }
        }
        for (int i = 0; i < 5; i++){
            pos_x = (int) (Math.random()*8);
            pos_y = (int) (Math.random()*8);
            if (matriz[pos_x][pos_y].equals(" ● ") || matriz[pos_x][pos_y].equals(" ○ ")){
                i--;
            }
            else {
                matriz[pos_x][pos_y] = " ● ";
            }
        }
        for (int i = 0; i < 8; i++){

            for (int j = 0; j < 8; j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
        //movimiento de las fichas
        do {
            System.out.println("elija la cordenada x de la ficha a mover: ");
            int pos_x1 = teclado.nextInt();
            System.out.println("elija la cordenada y de la ficha a mover: ");
            int pos_y1 = teclado.nextInt();
            System.out.println("para que direccion desea moverlo");
            dire = teclado.next();
            if (matriz[pos_x1][pos_y1].equals(" ○ ")) {
                if (dire.equals("izquierda")) {
                    if (matriz[pos_x1 - 1][pos_y1 - 1].equals(" ● ") && matriz[pos_x1 - 2][pos_y1 - 2].equals(" _ ")) {
                        new_pos_x1 = pos_x1 - 2;
                        new_pos_y1 = pos_y1 - 2;
                        matriz[pos_x1 - 1][pos_y1 - 1] = " _ ";
                    } else {
                        new_pos_x1 = pos_x1 - 1;
                        new_pos_y1 = pos_y1 - 1;
                    }
                }
                if (dire.equals("derecha")) {
                    if (matriz[pos_x1 - 1][pos_y1 + 1].equals(" ● ") && matriz[pos_x1 - 2][pos_y1 + 2].equals(" _ ")) {
                        new_pos_x1 = pos_x1 - 2;
                        new_pos_y1 = pos_y1 + 2;
                        matriz[pos_x1 - 1][pos_y1 - 1] = " _ ";
                    } else {
                        new_pos_x1 = pos_x1 - 1;
                        new_pos_y1 = pos_y1 + 1;
                    }
                }
                if (new_pos_y1 < 0 || new_pos_y1 > 7 || new_pos_x1 < 0 || new_pos_x1 > 7 || !matriz[new_pos_x1][new_pos_y1].equals(" _ ")) {
                    System.out.println("movimiento invalido");
                } else {
                    matriz[new_pos_x1][new_pos_y1] = " ○ ";
                    matriz[pos_x1][pos_y1] = " _ ";
                }

            }

            if (matriz[pos_x1][pos_y1].equals(" ● ")) {
                if (dire.equals("izquierda")) {
                    if (matriz[pos_x1 + 1][pos_y1 - 1].equals(" ○ ") && matriz[pos_x1 + 2][pos_y1 - 2].equals(" _ ")) {
                        new_pos_x1 = pos_x1 + 2;
                        new_pos_y1 = pos_y1 - 2;
                        matriz[pos_x1 + 1][pos_y1 - 1] = " _ ";
                    } else {
                        new_pos_x1 = pos_x1 + 1;
                        new_pos_y1 = pos_y1 - 1;
                    }
                }
                if (dire.equals("derecha")) {
                    if (matriz[pos_x1 + 1][pos_y1 + 1].equals(" ○ ") && matriz[pos_x1 + 2][pos_y1 + 2].equals(" _ ")) {
                        new_pos_x1 = pos_x1 + 2;
                        new_pos_y1 = pos_y1 + 2;
                        matriz[pos_x1 + 1][pos_y1 + 1] = " _ ";
                    } else {
                        new_pos_x1 = pos_x1 + 1;
                        new_pos_y1 = pos_y1 + 1;
                    }
                }
                if (new_pos_y1 < 0 || new_pos_y1 > 7 || new_pos_x1 < 0 || new_pos_x1 > 7 || !matriz[new_pos_x1][new_pos_y1].equals(" _ ")) {
                    System.out.println("movimiento invalido");
                } else {
                    matriz[new_pos_x1][new_pos_y1] = " ● ";
                    matriz[pos_x1][pos_y1] = " _ ";
                }

            }

            for (int i = 0; i < 8; i++){

                for (int j = 0; j < 8; j++){
                    System.out.print(matriz[i][j]);
                }
                System.out.println();
            }
        }
        while (new_pos_y1 < 0 || new_pos_y1 > 7 || new_pos_x1 < 0 || new_pos_x1 > 7 || !matriz[new_pos_x1][new_pos_y1].equals(" _ "));

    }
}
