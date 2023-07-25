/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author D E L L
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        /*
        Escribe una función, que devuelve 1 si una lista dada está ordenada 
        ascendentemente de principio a final, 2 si está ordenada 
        descendentemente, o 0 si no está ordenada de ninguna forma.
        */
        
        Metodos m = new Metodos();
        int op;
        
        do {
            op = m.menu();
            switch (op) {
                case 1 -> m.insertar();
                case 2 -> {
                    m.recorrer();
                    System.out.println("null");
                }
                case 3 -> {
                    int uwu = m.comprobar();
                    if (uwu == 0) {
                        System.out.println("No está ordenada");
                    } else if (uwu == 1) {
                        System.out.println("Está ordenada de forma ascendente");
                    } else {
                        System.out.println("Está ordenada de forma descendente");
                    }
                }
            }
        } while (op!=0);
    }    
}
