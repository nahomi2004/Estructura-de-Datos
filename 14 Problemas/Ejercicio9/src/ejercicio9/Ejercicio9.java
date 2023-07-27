/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

/**
 *
 * @author D E L L
 */
public class Ejercicio9 {

    public static void main(String[] args) {
/*
    Diseñar un algoritmo que permita invertir los nodos de una lista lineal 
    sencilla.
*/

        Metodos m = new Metodos();
        int op;

        do {
            op = m.menu();
            switch (op) {
                case 1 ->
                    m.insertar();
                case 2 -> {
                    m.recorrer(m.head);
                    System.out.println("null");
                }
                case 3 -> {
                    m.listaInvertida();
                    m.recorrer(m.head);
                    System.out.println("null");
                }
            }
        } while (op != 0);
    }
}
