/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

/**
 *
 * @author D E L L
 */
public class Ejercicio6 {

    public static void main(String[] args) {
/*
    Diseñar un algoritmo que permita desplegar el contenido de los nodos de 
    una lista lineal sencilla de forma invertida.
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
                    m.recorrerInvertido();
                    System.out.println("null");
                }
            }
        } while (op != 0);
    }
}
