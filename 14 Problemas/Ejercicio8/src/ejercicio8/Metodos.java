/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author SALA H
 */
public class Metodos {

    Nodo head;
    // Nodo head2;
    // Nodo tail2;
    int cont;
    Scanner entrada;

    public Metodos() {
        this.head = null;
        // this.head2 = null;
        this.entrada = new Scanner(System.in);
        this.cont = 0;
    }

    public int menu (){
        System.out.println("\nInsertar            [1]: ");
        System.out.println("Recorrer            [2]: ");
        System.out.println("Recorrer lista dos  [3]: ");
        System.out.println("Salir               [0]:");
        return entrada.nextInt();         
    }
    
    public boolean listaVacia(Nodo aux) {
        return (aux == null);
    }

    public void insertar() {
        int num;
        System.out.println("Ingrese un número:");
        num = entrada.nextInt();
        Nodo nuevo = new Nodo(num);
        if (listaVacia(head)) {
            head = nuevo;
        } else {
            Nodo actual = head;

            while (actual.sig != null) {
                actual = actual.sig;
            }
            actual.sig = nuevo;
            cont++;
        }
    }

    public void recorrer(Nodo aux) {
        Nodo actual = aux;
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.sig;
        }
    }
    
    public void recorrer(Nodo aux, int limite) {
        Nodo actual = aux;
        while (actual != null) {
            if (actual.dato < limite) {
                System.out.print(actual.dato + " -> ");
            }
            actual = actual.sig;
        }
    }
    
    public boolean numMayor(int num, int dato) {
        return (num>dato);
    }
}
