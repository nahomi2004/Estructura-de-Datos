/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuadradoasteriscos;

import java.util.Scanner;

/**
 *
 * @author D E L L
 */
public class CuadradoAsteriscos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de filas y columnas (n): ");
        int n = scanner.nextInt();
        
        // Evalúo el tamaño de la matriz
        if (n%2!=0) {
            Metodos matriz = new Metodos(n);
            // Mostrar el cuadrado mágico
            matriz.llenarMatriz();
            matriz.presentarMatriz();
        } else {
            System.out.println("Ingrese un número impar");
        }       
    }
    
}
