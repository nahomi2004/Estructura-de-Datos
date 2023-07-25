/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author SALA H
 */
public class Metodos {

    Nodo head;
    Nodo tail;
    Scanner entrada;

    public Metodos() {
        this.head = null;
        this.tail = null;
        this.entrada = new Scanner(System.in);
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
        } else {
            Nodo actual = head;

            while (actual.sig != null) {
                actual = actual.sig;
            }
                        
            actual.sig = nuevo;
            nuevo.ant = actual;
            actual = nuevo;
            tail = nuevo;
            tail.ant = nuevo.ant;
            tail.sig = nuevo.sig;
        }
    }

    public void recorrer(Nodo aux) {
        Nodo actual = aux;
        if (listaVacia()) {
            System.err.println("Lista vacía");
        } else {
            while (actual != null) {
                System.out.print(actual.dato + " -> ");
                actual = actual.sig;
            }
        }        
    }
    
    public void listaInvertida() {
        Nodo actual = tail;
        
        if (listaVacia()) {
            System.err.println("Lista vacía");
        } else {
                        
            Nodo aux = tail;            
            tail = head;
            head = aux;            
                        
            while (actual != null) {  
                actual.sig = actual.ant;                
                actual = actual.ant;    
            }
        }  
    }

    /*public void recorrerInvertido() {
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
    
    if (listaVacia()) {
            System.err.println("Lista vacía");
        } else {
            while (actual != null) {
                if (head.sig==tail){
                    int aux = tail.dato;
                    tail.dato = head.dato;
                    head.dato = aux;
                    actual = null;
                } else {
                    Nodo aux = tail;
                    tail = head;
                    head = aux;
                
                    actual.sig = actual.ant;
                    actual = actual.ant;
                }
            }
        }  
    */    
}
