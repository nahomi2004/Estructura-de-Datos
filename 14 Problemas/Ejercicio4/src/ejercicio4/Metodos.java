/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author SALA H
 */
public class Metodos {

    Nodo head;
    Nodo head2;
    Scanner entrada;

    public Metodos() {
        this.head = null;
        this.head2 = null;
        this.entrada = new Scanner(System.in);
    }

    public int menu() {
        System.out.println("\nInsertar lista uno  [1]: ");
        System.out.println("Insertar lista dos  [2]: ");
        System.out.println("Recorrer lista uno  [3]: ");
        System.out.println("Recorrer lista dos  [4]: ");
        System.out.println("Eliminar            [5]: ");
        System.out.println("Salir               [0]:");
        return entrada.nextInt();
    }

    public boolean listaVacia() {
        return (head == null);
    }

    public void recorrer(Nodo aux) {
        Nodo actual = aux;
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.sig;
        }
    }

    public void insOrdenado(Nodo aux) {
        int num;
        System.out.print("Ingrese dato: ");
        num = entrada.nextInt();
        Nodo nuevo = new Nodo(num);
        if (listaVacia()) {
            aux = nuevo;
        } else {
            if (num < aux.dato) {
                nuevo.sig = aux;
                aux = nuevo;
            } else {
                Nodo actual = aux;
                while (actual.sig != null && num > actual.sig.dato) {
                    actual = actual.sig;
                }
                nuevo.sig = actual.sig;
                actual.sig = nuevo;
            }
        }
    }

    public void crearListaTres(Nodo aux, Nodo aux2) {
        Nodo actual = head;
        Nodo actual2 = head2;

        while (actual.sig != null || actual2.sig != null) {
            if (actual.dato < actual2.dato) {
                Nodo nuevo = new Nodo(actual.dato);
            }
        }
    }
}
