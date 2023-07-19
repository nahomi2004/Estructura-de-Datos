/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author D E L L
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        /*
        Implemente una función que para una lista dada, elimine el nodo que 
        tenga el valor mayor.
         */

        int op;
        Metodos mylista = new Metodos();

        do {
            op = mylista.menu();
            switch (op) {
                case 1 ->
                    mylista.insertar();
                case 2 -> {
                    mylista.recorrer();
                    System.out.println(" null");
                }
                case 3 ->
                    mylista.eliminar();
                default -> {
                    System.out.println("Adiós");
                    op = 0;
                }
            }

        } while (op != 0);
    }
}
