/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrices;

import java.util.Scanner;

/**
 *
 * @author D E L L
 */
public class Matrices {

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
        matriz.ordenarMatriz();
        System.out.println("MATRIZ ORDENADA");
        matriz.presentarMatriz();
        System.out.println("NOTA: Se debe tener en cuenta que este programa ordena la "
                + "matriz en orden ascendente basado en el primer elemento de "
                + "cada fila. ");
        
        System.out.println("Primero la ordena así ->   | | | |");
        System.out.println("Luego la odena así ->  ----\n\t\t\t----\n\t\t\t----\n\t\t\t----");
    }
    
}
