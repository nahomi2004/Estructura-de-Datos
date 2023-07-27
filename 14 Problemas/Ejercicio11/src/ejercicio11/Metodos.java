/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author SALA H
 */
public class Metodos {

    Nodo head;
    Scanner entrada;
    int cont;

    public Metodos() {
        this.head = null;
        this.entrada = new Scanner(System.in);
        this.cont = 0;
    }

    public int menu() {
        System.out.println("\nInsertar                                       [1]: ");
        System.out.println("Recorrer                                       [2]: ");
        System.out.println("Eliminar a partir de la posición del nodo dado [3]: ");
        System.out.println("Salir                                          [0]:");
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
        } else {
            Nodo actual = head;

            while (actual.sig != null) {
                actual = actual.sig;
            }
            actual.sig = nuevo;
            nuevo.ant = actual;
            cont++;
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

    public void eliminar() {
        System.out.println("Ingrese la posición:");
        int pos = entrada.nextInt();

        int c = 0;

        if (pos > cont) {
            System.out.println("No hay como eliminar porque esa posición no existe");
            return;
        }

        if (listaVacia()) {
            System.out.println("");
            System.err.println("Lista Vacia...");
        } else {
            Nodo actual = head;
            while (c != pos) {
                actual = actual.sig;
                c++;
            }

            if (c == 0) {
                head.sig = null;
                head = null;
            } else {
                actual = actual.ant;
                actual.sig = null;
                actual = null;
            }

            System.out.println("Nodo eliminados correctamente :D");
        }
    }
}


/*public void ordenar() {
        Nodo actual = head;
        Nodo puntero = head.sig;
        
        if (listaVacia()) {
            System.err.println("Lista vacía");
            return;
        }
        Nodo auxCom, auxPeque;
        int temp;

        for (auxCom = head; auxCom.sig != null; auxCom = auxCom.sig) {
            Nodo min = auxCom;
            for (auxPeque = auxCom.sig; auxPeque != null; auxPeque = auxPeque.sig) {
                if (auxPeque.dato < min.dato) {
                    min = auxPeque;
                } 
            }
            if (min != auxCom) {
                temp = auxCom.dato;
                auxCom.dato = min.dato;
                min.dato = temp;
            }
        }
    }*/

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
