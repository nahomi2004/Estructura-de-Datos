/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diagonalsecundaria;

import java.util.Scanner;

public class DiagonalSecundaria {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int n,m;
        
        System.out.println("Ingrese el tamaño de la matriz");
        System.out.print("Filas y Columnas: ");
        n = entrada.nextInt();
        
        Metodos matriz = new Metodos(n,n);
        
        matriz.llenarMatriz();
        System.out.println("MATRIZ ORIGINAL");
        matriz.presentarMatriz();
        System.out.println("Suma Diagonal Secundaria: "+matriz.sumaDiagonal());
        
    }    
}
