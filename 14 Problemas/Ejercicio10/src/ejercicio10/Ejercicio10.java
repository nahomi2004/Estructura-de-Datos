/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author D E L L
 */
public class Ejercicio10 {

    public static void main(String[] args) {
/*
    Diseñar un algoritmo que permita ordenar una lista lineal sencilla 
    utilizando el método burbuja.
*/

        Metodos m = new Metodos();
        int op;

        do {
            op = m.menu();
            switch (op) {
                case 1 ->
                    m.insertar();
                case 2 -> {
                    m.recorrer();
                    System.out.println("null");
                }
                case 3 -> {
                    m.ordenar();
                    m.recorrer();
                    System.out.println("null");
                }
            }
        } while (op != 0);
    }
}
