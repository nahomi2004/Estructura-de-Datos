/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package piramide;

/**
 *
 * @author D E L L
 */
public class Metodos {
    /*  Dada una matriz de tamaño NxN (impar), realice un método que me permita 
        mostrar un cuadro de asteriscos (solo bordes) */
    
    String [][] matriz;
    
    public Metodos (int _n) {
        matriz = new String [_n][_n];
    }
    
    public void llenarPiramide () {
        int n = matriz.length;
        int pi = n / 2;
        for (int i = 0; i <= pi; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= pi - i && j <= pi + i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
