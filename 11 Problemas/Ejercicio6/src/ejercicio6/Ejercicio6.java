
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        // Se dispone de un arreglo T de n números diferentes de 0, (puede ser llenada por un
        // procedimiento que genere números aleatorios distintos de cero); crear un nuevo
        // arreglo en el que todos sus elementos resulten de dividir los elementos del arreglo T
        // por el elemento T[i], siendo i un valor leído por teclado.
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Tamaño de su arreglo: ");
        int lim = entrada.nextInt();
        
        Metodos arreglo = new Metodos(lim);
        
        System.out.println("Ingrese una posición cualquiera");
        int n = entrada.nextInt();
        
        arreglo.llenar();
        arreglo.dividir(n);
        
    }
    
}
