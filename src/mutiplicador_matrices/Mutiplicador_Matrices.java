/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mutiplicador_matrices;

import java.util.Scanner;

/**
 *
 * @author alumnat
 */
public class Mutiplicador_Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Añadimos la posibilidad de hacer input
        Scanner input = new Scanner(System.in);

        //Pedimos el tamaño de las matrices al usuario
        System.out.println("Elige el tamaño de las matrices. Recuerda que el "
                + "numero de filas de A debe ser igual al numero "
                + "de columnas de B \n");

        System.out.print("Elige las columnas de A: ");
        int col_a = input.nextInt();
        System.out.print("Elige las filas de A: ");
        int row_a = input.nextInt();

        System.out.println("");

        System.out.print("Elige las columnas de B: ");
        int col_b = input.nextInt();
        System.out.print("Elige las filas de B: ");
        int row_b = input.nextInt();

        System.out.println("");

        //Comprobamos si cse puede multiplicar y si es posible generamos las
        //matrices y las multiplicamos
        if (row_a == col_b) {
            System.out.println("Matriz A:");
            int[][] matriz_a = random_gen(col_a, row_a);

            System.out.println("Matriz B:");
            int[][] matriz_b = random_gen(col_b, row_b);

            System.out.println("Matriz C:");
            calculo(matriz_a, matriz_b);

        } else {
            System.out.println("El numero de colummnas de A no coincide con B");
        }

    }

    public static int[][] random_gen(int col, int row) {

        int[][] matriz = new int[col][row];

        //Generamos la matriz y la mostramos por pantalla
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                matriz[i][j] = (int) (Math.random() * 100) + 1;
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("");

        return matriz;
    }

    public static int[][] calculo(int[][] matriz_a, int[][] matriz_b) {
        //Matriz resultado
        int[][] matriz_c = new int[matriz_a.length][matriz_b[0].length];

        //Multiplicamos las matrices y mostramos por pantalla la matriz C
        for (int i = 0; i < matriz_a.length; i++) {
            for (int j = 0; j < matriz_b[0].length; j++) {
                for (int k = 0; k < matriz_a[0].length; k++) {
                    matriz_c[i][j] += matriz_a[i][k] * matriz_b[k][j];
                }
                System.out.print(matriz_c[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("");

        return matriz_c;
    }

}
