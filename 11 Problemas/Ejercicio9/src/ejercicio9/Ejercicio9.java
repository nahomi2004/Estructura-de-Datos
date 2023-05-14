
package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        // Dada una lista L de n elementos, diseñar un programa que 
        // calcule la suma de números pares e impares contenidos en ella.
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("¿De qué tamaño desea a su vector?: ");
        int n = entrada.nextInt();
        
        Metodos arreglo = new Metodos(n);
        
        arreglo.llenarArreglo();
        arreglo.presentarArreglo();
        System.out.printf("%s",arreglo.toString());
    }
    
}
