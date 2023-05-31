/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menumatrices;

import java.util.Scanner;

public class Metodos {
   Scanner entrada = new Scanner(System.in);

    public Metodos() {
        this.entrada = new Scanner(System.in);
    }

    public int menu() {
        System.out.print("Ingrese la opcion que realizar: \n");
        System.out.println("Suma de Matrices                   [1]");
        System.out.println("Resta de Matrices                  [2]");
        System.out.println("Multiplicación por un escalar      [3]");
        System.out.println("Traspuesta de la primera matriz    [4]");
        System.out.println("Salir                              [0]");
        return entrada.nextInt();
    }

    public int[][] leerMatriz() {
        System.out.println("Ingrese el numero de las filas: ");
        int f = entrada.nextInt();
        System.out.println("Ingrese el numero de las columnas: ");
        int c = entrada.nextInt();

        int[][] mat = new int[f][c];
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Ingrese el valor para la posicion"
                        + " [" + i + "] [" + j + "]:");
                mat[i][j] = entrada.nextInt();
            }
        }
        return mat;
    }

    public void sumaMatrices() {

        int[][] ma1 = leerMatriz();
        int[][] ma2 = leerMatriz();

        if (ma1.length != ma2.length || ma1[0].length != ma2[0].length) {
            System.out.println("No se pueden sumar las matrices.");
            return;
        }
        int f = ma1.length;
        int c = ma1[0].length;
        int[][] r = new int[f][c];

        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                r[i][j] = ma1[i][j] + ma2[i][j];
            }
        }

        System.out.println("La suma de las matrices es: ");
        presentar(r);
    }

    public void restaMatrices() {

        int[][] matriz1 = leerMatriz();
        int[][] matriz2 = leerMatriz();

        if (matriz1.length != matriz2.length || matriz1[0].length != matriz2[0].length) {

            System.out.println("No se pueden restar....");
            return;
        }
        int fila = matriz1.length;
        int columna = matriz1[0].length;
        int[][] re = new int[fila][columna];

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                re[i][j] = matriz1[i][j] - matriz2[i][j];
            }
        }

        System.out.println("La resta de las matrices es: ");
        presentar(re);
    }

    public void multiplicaEscalar() {
        int[][] matriz = leerMatriz();
        System.out.println("Ingresar Escalar: ");
        int c = entrada.nextInt();

        int fila = matriz.length;
        int columna = matriz[0].length;
        int[][] res = new int[fila][columna];

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                res[i][j] = matriz[i][j] * c;
            }
        }

        System.out.println("La multiplicacion por un escalar es: ");
        presentar(res);
    }

    public void transpuestaMatrices() {
        int[][] mat = leerMatriz();
        int fil = mat.length;
        int colum = mat[0].length;
        int[][] transp = new int[colum][fil];

        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < colum; j++) {
                transp[j][i] = mat[i][j];
            }
        }
        System.out.println("La transpuesta de la matriz es: ");
        presentar(transp);
    }

    public void presentar(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

}
