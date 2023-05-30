/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrizaleatoria;

import java.util.Scanner;

/**
 *
 * @author D E L L
 */
public class MatrizAleatoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de filas y columnas (n): ");
        int n = scanner.nextInt();
        
        Metodos matriz = new Metodos(n);
            // Mostrar el cuadrado mágico
        matriz.llenarMatriz();
        matriz.presentarMatriz();
    }
    
}
