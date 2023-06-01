/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package piramide;

import java.util.Scanner;

public class Piramide {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de filas y columnas (n): ");
        int n = scanner.nextInt();
        
        // Evalúo el tamaño de la matriz
        if (n%2!=0) {
            Metodos matriz = new Metodos(n);
            matriz.llenarPiramide();
            matriz.presentarMatriz();
        } else {
            System.out.println("Ingrese un número impar");
        }       
    }
    
}
