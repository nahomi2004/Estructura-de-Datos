/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author D E L L
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        /*
        Escribe una función que dada una lista L devuelva otra lista R 
        conteniendo los elementos repetidos de L. Por ejemplo, si L almacena 
        los valores 5, 2, 7, 2, 5, 5, 1, debe construirse una lista R con los
        valores 5, 2. Si en L no hay elementos repetidos, R será la lista vacía.
        */
        Metodos metodos = new Metodos();
        System.out.println("Cuántos números quiere ingresar");
        int num = metodos.entrada.nextInt();
        
        for (int i=0 ; i<num ; i++) {
            metodos.insertar();
        }
        
        metodos.crearLista();
        
        System.out.println("LISTA UNO");
        metodos.recorrer(metodos.head);
        System.out.println("null");
        
        System.out.println("");
        System.out.println("LISTA DOS");
        metodos.recorrer(metodos.head2);
        System.out.println("null");
    }    
}
