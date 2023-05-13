
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        // Escriba un programa que me permita almacenar en un arreglo, 
        // el número de la serie fibonacci correspondiente a cada una de 
        // sus posiciones.
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = entrada.nextInt();
        
        Metodos arreglo = new Metodos(n);
        
        System.out.println("NÚMEROS DE LA SERIE FIBONACCI");
        arreglo.llenarArreglo();
        arreglo.presentarArreglo();
    }
    
}
