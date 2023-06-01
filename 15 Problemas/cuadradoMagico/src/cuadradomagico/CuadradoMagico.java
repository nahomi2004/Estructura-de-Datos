/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuadradomagico;

import java.util.Scanner;

public class CuadradoMagico {

    public static void main(String[] args) {
        
        // Pedir al usuario el número de filas y columnas (N)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de filas y columnas (n): ");
        int n = scanner.nextInt();
        
        // Evalúo el tamaño de la matriz
        if (n%2!=0) {
            Metodos matriz = new Metodos();
            // Mostrar el cuadrado mágico
            System.out.println("Cuadrado Mágico:");
            matriz.mostrarCuadradoMagico(n);
        } else {
            System.out.println("Ingrese un número impar");
        }       
    }    
}
