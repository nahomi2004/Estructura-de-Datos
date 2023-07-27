/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author D E L L
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op, num;
        Metodos myArbol = new Metodos();

        do {
            op = myArbol.menu();
            switch (op) {
                case 1 -> {
                    myArbol.insertar();
                }
                case 2 -> {
                    myArbol.recorrer(myArbol.head);
                    System.out.println("null");
                }
                case 3 -> {
                    myArbol.crearListas();
                    System.out.println("Creadas con éxito uwu");
                    myArbol.recorrer(myArbol.head1);
                    System.out.println("null");
                    myArbol.recorrer(myArbol.head2);
                    System.out.println("null");
                }
                default -> {

                }
            }
        } while (op != 0);
    }
}
