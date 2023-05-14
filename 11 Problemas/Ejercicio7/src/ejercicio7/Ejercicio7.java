
package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        // Se dispone de un arreglo de n elementos. Se desea diseñar un algoritmo
        // que permita insertar el valor x en la posición k‐ésima de la lista, 
        // debiendo desplazarse los elementos hacia la derecha para dar lugar 
        // al nuevo elemento y desechando el último elemento sobrante.
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese el tamaño del arreglo: ");
        int lim = entrada.nextInt();
        
        Metodos arreglo = new Metodos (lim); 
        arreglo.llenarArreglo();
        arreglo.presentarArreglo(arreglo.miArreglo);
        
        System.out.print("Ingrese la posición en la que desea insertar el número: ");
        int k = entrada.nextInt(); 
        
        if ((k<arreglo.miArreglo.length)&&(k>0)) {            
            arreglo.insertarNumero(k);
        } else {
            System.out.println("ERROR\nPosición no encontrada");
        }
    }
    
}
