/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package piramideinversa;

/**
 *
 * @author D E L L
 */
public class Metodos {
    
    String [][] matriz;
    
    public Metodos (int _n) {
        matriz = new String [_n][_n];
    }
    
    public void llenarPiramide () {
        int n = matriz.length;
        int pi = n / 2;
        
        /*for (int x=0;x<=pi;x++) {
            for (int i=x;i<n-x;i++) {
                matriz [i][(n-1)-x] = "*";                
            }
        }*/ // Esta si imprime la pirámide con la punta hacia la izquierda
        
        for (int x=0;x<=pi;x++) {
            for (int i=x;i<n-x;i++) {
                matriz [x][i] = "*";                
            }
        } // Esta si imprime la pirámide inversa
        
        for (int i=0;i<matriz.length;i++) {
            for (int j=0;j<matriz.length;j++) {
                if (matriz[i][j]==null)
                    matriz[i][j]="-";
            }
        }
        
        /*for (int i=pi; i>=0; i--) {
            for (int j=0; j<n; j++) {
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
