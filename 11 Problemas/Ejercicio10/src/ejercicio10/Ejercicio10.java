
package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        // Se desea realizar un programa que permita controlar las reservas 
        // de plazas de un vuelo Quito‐Loja, de acuerdo con las siguientes 
        // normas de la compañía aérea.
        //      a. Número de plazas del avión: 100.
        //      b. Plazas numeradas del 1 al 30: fumadores.
        //      c. Plazas numeradas del 31 al 100: no fumadores.
        // Se desea realizar la reserva a petición del pasajero y cerrar la 
        // reserva cuando no haya plazas libres o el avión esté próximo a 
        // despegar. Como ampliación de este algoritmo, considere la opción 
        // de anulaciones imprevistas de reservas.
        // (Considere la utilización de un menú por pantalla 
        // para representar cada uno de los estados).
        Scanner entrada = new Scanner(System.in);
        
        Metodos vuelo = new Metodos();
        int n;
        int opc;
        String id;        
        
        System.out.println("¿El avión está próximo a despegar?");
        System.out.println("Sí [1]\tNo[2]");
        n = entrada.nextInt();            
        if (n==2) {
            do {
                opc = vuelo.menu();
                switch (opc) {
                    case 1 -> {
                        System.out.println("¿En qué sección desea su reserva?\n"
                                + "Fumadores [1]\nNo Fumadores [2]");
                        n = entrada.nextInt();
                        switch (n) {
                            case 1 -> vuelo.llenarFumadores();
                            case 2 -> vuelo.llenarNoFumadores();
                            default -> System.out.println("Ingrese 1 o 2");
                        }
                    } 
                    case 2 -> {
                        System.out.println("¿En qué sección se encuentra su reserva?\n"
                                + "Fumadores [1]\nNo Fumadores [2]");
                        n = entrada.nextInt();
                        entrada.nextLine();
                        switch (n) {
                            case 1 -> {
                                System.out.println("Ingrese el ID de quien realizó la reserva:");        
                                id = entrada.nextLine(); 
                                vuelo.eliminarFumadores(id);
                            }
                            case 2 -> {
                                System.out.println("Ingrese el ID de quien realizó la reserva:");        
                                id = entrada.nextLine();
                                vuelo.eliminarNoFumadores(id);
                            }
                            default -> {
                                System.out.println("Ingrese 1 o 2");
                            }
                        }
                    }
                    default -> {
                        System.out.println("GRACIAS POR VISITAR NUESTRA PÁGINA WEB");
                    }
                }  
            } while (opc!=0);
        } else {
                System.out.println("El vuelo ya no está disponible\n"
                        + "Puede volver a nuestra página principal a revisar"
                        + " próximos vuelos\nGRACIAS\n");
        }
        
    }
    
}
