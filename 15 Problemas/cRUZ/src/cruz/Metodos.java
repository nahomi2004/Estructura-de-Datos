/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cruz;

public class Metodos {
    /*  Dada una matriz de tamaño NxN (impar), realice un método que me permita 
        mostrar una cruz de asteriscos */
    
    String [][] matriz;
    
    public Metodos (int _n) {
        matriz = new String [_n][_n];
    }
    
    public void llenarCruz () {
        int n = matriz.length;
        int pi = n / 2;
        
        for (int i=0; i<n; i++) {
            for (int j=0; j<2; j++) {
                if (j==0) {
                    matriz [i][pi] = "*";
                } else {
                    matriz [pi][i] = "*";
                }
            }
        }
        
        for (int i=0;i<matriz.length;i++) {
            for (int j=0;j<matriz.length;j++) {
                if (matriz[i][j]==null)
                    matriz[i][j]="-";
            }
        }
    }
    
    public void presentarMatriz () {
        for (int i=0;i<matriz.length;i++) {
            for (int j=0;j<matriz[i].length;j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("");
        }
    }
}
