/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author SALA H
 */
public class Metodos {

    Nodo head;
    Nodo tail;
    int cont;
    Scanner entrada;
    int lim;

    public Metodos() {
        this.head = null;
        this.tail = null;
        this.entrada = new Scanner(System.in);
        this.lim = 20;
        this.cont = 0;
    }

    public int menu (){
        System.out.println("\nInsertar            [1]: ");
        System.out.println("Recorrer            [2]: ");
        System.out.println("Recorrer invertido  [3]: ");
        System.out.println("Salir               [0]:");
        return entrada.nextInt();         
    }
    
    public boolean listaVacia() {
        return (head == null);
    }

    public void insertar() {
        int num;
        System.out.print("Ingrese dato: ");
        num = entrada.nextInt();
        Nodo nuevo = new Nodo(num);
        if (listaVacia()) {
            head = nuevo;
            tail = nuevo;
            head.ant = null;
        } else {
            Nodo actual = head;

            while (actual.sig != null) {
                actual = actual.sig;
            }
            nuevo.ant = actual;
            actual.sig = nuevo;
            tail = nuevo;
            tail.ant = nuevo.ant;
            tail.sig = nuevo.sig;
        }
    }

    public void recorrer() {
        Nodo actual = head;
        if (listaVacia()) {
            System.err.println("Lista vacía");
        } else {
            while (actual != null) {
                System.out.print(actual.dato + " -> ");
                actual = actual.sig;
            }
        }        
    }

    public void recorrerInvertido() {
        Nodo actual = tail;
        if (listaVacia()) {
            System.err.println("Lista vacía");
        } else {
            while (actual != null) {
                System.out.print(actual.dato + " -> ");
                actual = actual.ant;
            }
        }  
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
