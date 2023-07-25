/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author SALA H
 */
public class Metodos {

    Nodo head;
    Scanner entrada;
    Nodo[] lista;

    public Metodos() {
        this.head = null;
        this.entrada = new Scanner(System.in);
        this.lista = new Nodo[10];
    }

    public int menu() {
        System.out.println("\nInsertar            [1]: ");
        System.out.println("Recorrer            [2]: ");
        System.out.println("Salir               [0]:");
        return entrada.nextInt();
    }

    public int sumarCaracteres(String texto) {

        char[] caracteres = texto.toCharArray();
        int suma = 0;

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            int ascii = (int) c;
            suma += ascii;
        }

        return suma %= 10;
    }

    public void llenarTabla(String nombre) {
        int posición = sumarCaracteres(nombre);
        Nodo nuevo = new Nodo(nombre);

        if (lista[posición] == null) {
            lista[posición] = nuevo;
        } else {
            nuevo.sig = lista[posición];
            lista[posición] = nuevo;
        }
        
        System.out.println("Nombre ingresado correctamente en la posición: " + posición);
    }

    public String recorrer() {
        String cadena = String.format("TABLA HASH\n");
        
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == null) {
                cadena = String.format("%s\nPosición [%d]: Vacía", cadena, i);
            } else {
                Nodo actual = lista[i];
                cadena = String.format("%s\nPosición [%d]:\n\t", cadena, i);

                while (actual != null) {
                    cadena = String.format("%s -> %s", cadena, actual.dato);
                    actual = actual.sig;
                }
            }
            
            cadena = String.format("%s -> null\n", cadena);
        }
        
        return cadena;
    }
}


/*

System.out.println("TABLA HASH");
        
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == null) {
                System.err.printf("Posición [%d] vacía\n", lista[i]);
            } else {
                Nodo actual = lista[i];
                System.err.printf("Posición [%d]\n", lista[i]);

                while (actual != null) {
                    System.out.printf("%d -> ", actual.dato);
                    actual = actual.sig;
                }
            }
            System.out.println("null");
            System.out.println("");
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
