/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package piramide;

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
        
        /*for (int x=0;x<=pi;x++) {
            for (int i=0;i<n-x;i++) {
                matriz [n-1][i] = "*";                
            }
            n--;
        }*/ //Esto imprime una escalera
        
        /* for (int x=0;x<=pi;x++) {
            for (int i=0;i<n-x;i++) {
                matriz [(n-1)-x][i] = "*";                
            }
        }*/ //Imprime una pendiente
        
        for (int x=0;x<=pi;x++) {
            for (int i=x;i<n-x;i++) {
                matriz [(n-1)-x][i] = "*";                
            }
        } // Esta si imprime la pirámide
        
        for (int i=0;i<matriz.length;i++) {
            for (int j=0;j<matriz.length;j++) {
                if (matriz[i][j]==null)
                    matriz[i][j]="-";
            }
        }
        
        /*for (int i = 0; i <= pi; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= pi - i && j <= pi + i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }*/
    }
    
    public void presentarMatriz () {
        for (int i=0;i<matriz.length;i++) {
            for (int j=0;j<matriz[i].length;j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }
}
