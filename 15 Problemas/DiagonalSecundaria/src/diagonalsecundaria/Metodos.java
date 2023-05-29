/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagonalsecundaria;

import java.util.Scanner;

/**
 *
 * @author D E L L
 */
public class Metodos {
    /*  Dado un arreglo de dos dimensiones de m x n elementos numéricos de tipo 
        entero, desarrollar un programa para sumar los elementos de la diagonal 
        invertida. */
    
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
    
    public int sumaDiagonal() {
        int suma = 0;
        int j = matriz[0].length-1;
        for (int i=0;i<matriz.length;i++) {
            suma+=matriz[i][j];
            j--;
        }
        return suma;
    }
}
