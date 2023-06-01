/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuadradoasteriscos;

public class Metodos {
    /*  Dada una matriz de tamaño NxN (impar), realice un método que me permita 
        mostrar un cuadro de asteriscos (solo bordes). */
    
    String [][] matriz;
    
    public Metodos (int _n) {
        matriz = new String [_n][_n];
    }
    
    public void llenarMatriz () {
        int[] k = {matriz.length-1,0};
        for (int i=0;i<matriz.length;i++) {
            for (int j=0;j<k.length;j++) {
                matriz[i][k[j]]="*";
            }
        }
        
        for (int j=0;j<k.length;j++) {
            for (int i=0;i<matriz.length;i++) {
                matriz[k[j]][i]="*";
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
            System.out.println("\n");
        }
    }
}
