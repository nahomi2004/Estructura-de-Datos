/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

/**
 *
 * @author D E L L
 */
public class TablasHash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodos m = new Metodos();
        int op;

        do {
            op = m.menu();
            switch (op) {
                case 1 -> {
                    System.out.print("Ingrese un nombre: ");
                    String nombre = m.entrada.next();
                    m.llenarTabla(nombre);
                }
                case 2 -> {
                    System.out.printf("%s\n", m.recorrer());
                }
            }
        } while (op != 0);
    }
}
