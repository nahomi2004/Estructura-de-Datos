/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package transpuestadiagonalsecundaria;

import java.util.Scanner;

public class TranspuestaDiagonalSecundaria {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de filas y columnas (n): ");
        int n = scanner.nextInt();
        
        Metodos matriz = new Metodos(n);
        
        matriz.llenarMatriz();
        System.out.println("Matriz original:");
        matriz.presentarMatriz();
        System.out.println("Matriz transpuesta:");
        matriz.presentarMatriz(matriz.transpuesta());
    }
    
}
