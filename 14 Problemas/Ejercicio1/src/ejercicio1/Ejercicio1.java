/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author D E L L
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        
/*
    Crear una función que permita insertar un elemento inmediatamente 
    después de un número dado que se encuentre en la lista.
*/

        Metodos metodos = new Metodos();
        System.out.println("Cuántos números quiere ingresar");
        int num = metodos.entrada.nextInt();

        for (int i = 0; i < num; i++) {
            metodos.insertar();
        }

        System.out.println("Número de la lista");
        int num2 = metodos.entrada.nextInt();
        System.out.println("Número que quiere ingresar");
        int num3 = metodos.entrada.nextInt();
        System.out.println("LISTA UNO");
        metodos.recorrer();
        System.out.println("null");
        metodos.insertarNum(num2, num3);
        System.out.println("LISTA DOS");
        metodos.recorrer();
        System.out.println("null");
    }
}
