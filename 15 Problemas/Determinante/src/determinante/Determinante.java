/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package determinante;

public class Determinante {

    public static void main(String[] args) {
        
        System.out.println("DETERMINANTES");
        int matriz[][]  = {{1,0,0,0},
                           {0,1,0,0},
                           {0,0,1,0},
                           {0,0,0,1}};
        int matrizDet[][] = new int[4][4]; 
        Metodos miMatriz = new Metodos();      
        int determinante = miMatriz.determinantes(matriz);
        System.out.println("La determinante de la matriz es: " + determinante);
        System.out.println("La matriz multiplicada por el determinante es: ");        
        miMatriz.presentar(matriz, determinante);
        
    }    
}
