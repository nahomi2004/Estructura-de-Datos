/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author D E L L
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        /*
        Implemente una función que suprima de la lista todos los elementos 
        mayores que un número dado como límite. Por ejemplo, si la lista 
        inicial es
        */
        Metodos m = new Metodos();
        int op;
        
        do {
            op = m.menu();
            switch (op) {
                case 1 -> m.insertar();
                case 2 -> {
                    m.recorrer(m.head);
                    System.out.println("null");
                }
                case 3 -> {
                    /*m.recorrer(m.numLimite());
                    System.out.println("null");*/
                    int limite;
                    System.out.println("Ingrese el límite:");
                    limite = m.entrada.nextInt();
                    m.recorrer(m.head, limite);
                    System.out.println("null");
                }
            }
        } while (op!=0);
    }    
}
