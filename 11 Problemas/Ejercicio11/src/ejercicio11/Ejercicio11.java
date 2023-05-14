
package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        // Se dispone de una lista de n nombres de alumnos. Escribir un 
        // programa que solicite el nombre de un alumno y busque en la lista 
        // si el nombre está o no.
        Scanner entrada = new Scanner(System.in);
        
        String id;
        
        System.out.println("¿De qué tamaño desea su lista?");
        int n = entrada.nextInt();
        entrada.nextLine(); 
        
        Metodos arreglo = new Metodos(n);
        
        arreglo.llenarArreglo(); 
        // Esta línea de código hace que la lectura del ID se lea correctamente
        // además se debe cambiar en llenarArreglo el nextLine() por el next()
        
        System.out.println("Ingrese el ID del alumno que desea buscar:");        
        id = entrada.nextLine();     
        arreglo.encontrarAlumno(id);
        
        arreglo.presentarArreglo();
    }
    
}
