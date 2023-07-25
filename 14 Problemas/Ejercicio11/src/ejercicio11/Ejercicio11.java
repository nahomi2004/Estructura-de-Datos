/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;

/**
 *
 * @author D E L L
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Diseñar un algoritmo que permita eliminar n número de nodos a partir 
        de la posición x en una lista sencilla lineal.
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
                    m.eliminar();
                }
            }
        } while (op!=0);
    }    
}
