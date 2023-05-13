
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        // Calcular el número de elementos negativos, cero y positivos de un 
        // vector dado de n elementos.
        Scanner entrada = new Scanner(System.in);
        int lim=0;
        System.out.println("Ingrese el tamaño del arreglo");
        lim = entrada.nextInt();
        
        Metodos arreglo = new Metodos(lim);
        arreglo.llenar();
        arreglo.calcular();
    }
    
}
