/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transpuestadiagonalsecundaria;

import java.util.Scanner;

public class Metodos {
    Scanner entrada;
    int [][] matriz;
    
    public Metodos (int _n) {
        entrada = new Scanner(System.in);
        matriz = new int [_n][_n];
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
    
    public void presentarMatriz (int [][]x) {
        for (int i=0;i<x.length;i++) {
            for (int j=0;j<x[i].length;j++) {
                System.out.print("["+x[i][j]+"] ");
            }
            System.out.println("");
        }
    } 
    
    public int[][] transpuesta () {
        int cont,aux;
        int n = matriz.length;
        
        for (int i=0;i<matriz.length-1;i++) {
            cont = n-i;            
            for (int j=0;j<matriz[0].length;j++) {
                cont--;
                if ((i+j)==(matriz.length-1)) {
                    j++;
                } else {
                    aux = matriz[i][j];
                    matriz[i][j] = matriz[i+cont][j+cont];
                    matriz[i+cont][j+cont] = aux;
                }
            }
        }
        return matriz;
    }
}
