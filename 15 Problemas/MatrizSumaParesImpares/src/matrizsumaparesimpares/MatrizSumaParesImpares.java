/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrizsumaparesimpares;

import java.util.Scanner;

/**
 *
 * @author D E L L
 */
public class MatrizSumaParesImpares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
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
        System.out.printf("%s\n",matriz);
    }
    
}
