/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author SALA H
 */
public class Metodos {

    Nodo head;
    Nodo head2;
    Nodo tail2;
    int cont;
    Scanner entrada;
    int lim;

    public Metodos() {
        this.head = null;
        this.head2 = null;
        this.tail2 = null;
        this.entrada = new Scanner(System.in);
        this.lim = 20;
        this.cont = 0;
    }

    /*public int menu (){
        System.out.println("\nInsertar            [1]: ");
        System.out.println("Recorrer            [2]: ");
        System.out.println("Insertar al inicio  [3]: ");
        System.out.println("Insertar ordenado   [4]: ");
        System.out.println("Eliminar            [5]: ");
        System.out.println("Salir               [0]:");
        return entrada.nextInt();         
    }*/
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
    
    /*
    public void recorrer(Nodo aux) {
        Nodo actual = aux;
        if (listaVacia(head)) {
            System.err.println("Lista vacía");
        } else {
            while (actual != null) {
                System.out.print(actual.dato + " -> ");
                actual = actual.sig;
            }
        }        
    }
    */

    public void crearLista() {
        Nodo actual = head;
        while (actual != null) {
            int num = numRepetidos(actual.dato);
            if (num != -1) {
                Nodo nuevo = new Nodo(num);
                if (listaVacia(head2)) {
                    head2 = nuevo;
                    tail2 = nuevo;
                } else {
                    if (num != tail2.dato) {
                        tail2.sig = nuevo;
                        tail2 = tail2.sig;
                    }
                }
            }
            actual = actual.sig;
        }
    }

    public int numRepetidos(int num) {
        Nodo actual = head;
        int cont = 0;
        while (actual != null) {
            if (num == actual.dato) {
                cont++;
            }
            actual = actual.sig;
        }
        if (cont > 1) {
            return num;
        }
        return -1;
    }

    /*public double promedio() {
        double promedio=0;
        Nodo actual = head;
        while (actual != null) {
            promedio+=actual.dato;
            actual = actual.sig;
        }
        return promedio/cont;
    }*/

 /*public void insInicio() {
        int num;
        System.out.print("Ingrese dato: ");
        num = entrada.nextInt();
        Nodo nuevo = new Nodo(num);
        if (listaVacia()) {
            head = nuevo;
            tail = nuevo;
        } else {
            nuevo.sig = head;
            head = nuevo;
        }
    }*/

 /*public void insOrdenado() {
        int num;
        System.out.print("Ingrese dato: ");
        num = entrada.nextInt();
        Nodo nuevo = new Nodo(num);
        if (listaVacia()) {
            head = nuevo;
            tail = nuevo;
        } else {
            if (num < head.dato) {
                nuevo.sig = head;
                head = nuevo;
            } else {
                Nodo actual = head;
                while (actual.sig != null && num > actual.sig.dato) {
                    actual = actual.sig;
                    nuevo.sig = actual.sig;
                    actual.sig = nuevo;
                    if (nuevo.sig == null) {
                        tail = nuevo;
                    }
                }
            }
        }
    }*/

 /*public void eliminar() {
        int num;
        System.out.print("Ingrese dato: ");
        num = entrada.nextInt();
        Nodo nuevo = new Nodo(num);
        if (listaVacia()) {
            head = nuevo;
            tail = nuevo;
        } else {
            if (num == head.dato) {
                if (head.sig == null) {
                    tail = null;
                }
                head = head.sig;
            } else {
                Nodo actual = head;
                while (actual.sig != null && actual.sig.dato != num) {
                    actual = actual.sig;
                }
                if (actual.sig == tail) {
                    tail = actual;
                }
                if (actual.sig != null) {
                    actual.sig = actual.sig.sig;
                } else {
                    System.out.println("No está :(");
                }

            }
        }
    }*/
}
