
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    
    public static void main(String[] args) {
        // Escriba un programa que me permita almacenar en un arreglo, 
        // el número primo correspondiente a cada una de sus posiciones.
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = entrada.nextInt();
        
        Metodos arreglo = new Metodos(n);
        
        System.out.println("NÚMEROS PRIMOS");
        System.out.println("Recordar: El número 1 no es un número primo");
        arreglo.llenarArreglo();
        arreglo.presentarArreglo();
    }
    
}
