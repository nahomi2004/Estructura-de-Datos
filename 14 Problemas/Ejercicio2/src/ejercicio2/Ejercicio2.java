/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author D E L L
 */
public class Ejercicio2 {

    public static void main(String[] args) {
/*
    Crear una función que permita calcular el promedio de los elementos de 
    una lista ya creada.
*/
        Metodos opc = new Metodos();

        for (int i = 0; i < 10; i++) {
            opc.insertar();
        }
        System.out.printf("Promedio: %.2f\n", opc.promedio());
        opc.recorrer();
        System.out.println(" null");
    }
}
