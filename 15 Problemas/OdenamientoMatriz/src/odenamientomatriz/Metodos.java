/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package odenamientomatriz;

import java.util.Scanner;

/**
 *
 * @author D E L L
 */
public class Metodos {
    Scanner entrada;
    int [][] matriz;
    
    public Metodos (int _n, int _m) {
        entrada = new Scanner(System.in);
        matriz = new int [_n][_m];
    }
    
    public void llenarMatriz () { 
        for (int i=0;i<matriz.length;i++) {
            for (int j=0;j<matriz[i].length;j++) {
                System.out.print("["+i+"] ["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
    }
    
    public void presentarMatriz () {
        for (int i=0;i<matriz.length;i++) {
            for (int j=0;j<matriz[i].length;j++) {
                System.out.print("["+matriz[i][j]+"] ");
            }
            System.out.println("");
        }
    }
    
    public int[][] ordenarMatriz () {
        int aux = 0;
        // Ordenar cada fila de la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length - 1; j++) {
                for (int k = 0; k < matriz[i].length - j - 1; k++) {
                    if (matriz[i][k] > matriz[i][k + 1]) {
                        aux = matriz[i][k];
                        matriz[i][k] = matriz[i][k + 1];
                        matriz[i][k + 1] = aux;
                    }
                }
            }
        }

        // Ordenar la matriz basándose en el primer elemento de cada fila
        for (int i = 0; i < matriz.length - 1; i++) {
            for (int j = 0; j < matriz.length - i - 1; j++) {
                if (matriz[j][0] > matriz[j + 1][0]) {
                    int[] temp = matriz[j];
                    matriz[j] = matriz[j + 1];
                    matriz[j + 1] = temp;
                }
            }
        }
        
        return matriz;
    }
}
