/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication24;

import java.util.Scanner;

/**
 *
 * @author D E L L
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        int n,m;
        
        System.out.println("Ingrese el tamaño de la matriz");
        System.out.print("Filas: ");
        n = entrada.nextInt();
        System.out.print("Columnas: ");
        m = entrada.nextInt();
        
        Metodos matriz = new Metodos(n,m);
        
        matriz.llenarMatriz();
        System.out.println("MATRIZ ORIGINAL");
        matriz.presentarMatriz();
        System.out.println("Suma de Filas");
        for (int i=0;i<matriz.matriz.length;i++) {
            System.out.print("["+matriz.sumarFilas()[i]+"] ");
        }
        System.out.println("");
        for (int i=0;i<m;i++) {
            System.out.print("["+matriz.sumarColumnas(m)[i]+"] ");
        }
    }
    
}
