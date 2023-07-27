/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author D E L L
 */
public class Ejercicio4 {

    public static void main(String[] args) {
/*
    Escribe una función que, dadas dos listas ordenadas de menor a mayor, 
    devuelva otra lista con todos los elementos de las dos listas 
    originales y ordenada también de menor a mayor (no incluir
    elementos repetidos).
 */
        int op;
        Metodos mylista = new Metodos();
        mylista.menu();
        do {
            op = mylista.menu();
            switch (op) {
                case 1 ->
                    mylista.insOrdenado(mylista.head);
                case 2 ->
                    mylista.insOrdenado(mylista.head2);
                case 3 ->
                    mylista.recorrer(mylista.head);
                case 4 ->
                    mylista.recorrer(mylista.head2);
                default -> {
                    System.out.println("Adiós");
                    op = 0;
                }
            }

        } while (op != 0);
    }
}
