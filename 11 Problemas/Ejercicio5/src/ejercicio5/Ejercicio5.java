
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        // Determinar si un arreglo de números enteros previamente leído, 
        // está ordenado.
        
        Scanner entrada = new Scanner(System.in);
        int opc;
        
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = entrada.nextInt();
        
        Metodos arreglo = new Metodos(n);
        
        arreglo.llenar();
        System.out.println("¿Quiere saber si el arreglo está ordenado de "
                + "mayor a menor o de menor a mayor?");
        System.out.println(" [1] Mayor a menor\n [2] Menor a mayor");
        opc = entrada.nextInt();
        
        switch (opc) {
            case 1 -> {
                System.out.printf("%s\n",arreglo.ordenadoMayor());
                break;
            }
            case 2 -> {
                System.out.printf("%s\n",arreglo.ordenadoMenor());
                break;
            }
            default -> {
                System.out.println("Ingrese 1 o 2\n Vuelva a intentarlo");
            }
        }
    }
    
}
