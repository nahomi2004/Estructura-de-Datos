/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enlazadasPilas;

import java.util.Scanner;

/**
 *
 * @author SALA H
 */
public class MetodosPilas {
    Scanner entrada;
    Nodo cima;
    Nodo head;
    
    public MetodosPilas () {
        this.entrada = new Scanner(System.in);
        this.cima = null;
        this.head=null;
    }
    
    public int menu() {
        System.out.println("");
        System.out.println("MENU PRINCIPAL");
        System.out.println("Push                [1]");
        System.out.println("Pop                 [2]");
        System.out.println("Ppresentar lista    [3]");
        System.out.println("Salir               [0]");
        return entrada.nextInt();
    }
    
    public boolean listaVacia(){
        return (head==null);
    }
    
    public void push() {
        int num;
        System.out.print("Ingrese elemento: ");
        num = entrada.nextInt();
        Nodo nuevo = new Nodo(num);
        if (listaVacia()) {
            head = cima = nuevo;
        } else {
            cima.sig = nuevo;
            cima = cima.sig;
        }
        /*
        if (!pilaLlena()) {
            System.out.println("Ingrese el elemento");
            tope++;
            miPila[tope] = entrada.nextInt();            
        } else {
            System.out.println("No hay espacio");
        }*/
    }
    
    public void pop() {
        if(listaVacia()) {
            System.out.println("Lista vacia...");
        } else {
            System.out.println("Elemento a eliminar: "+cima.dato);
            System.out.println("");
            if (head == cima) {
                head = cima = null;
            } else {
                Nodo actual = head;
                while (actual.sig.sig!=null) {
                    actual = actual.sig;
                }
                cima = actual;
                cima.sig = null;
            }
        } 
        /*if (!pilaVacia()) {
            System.out.println("El elemento es: "+miPila[tope]);
            tope--;
        } else {
            System.out.println("Pila vacia");
        }*/
    }
    
    public void presentar() {
        Nodo actual = head;
        while(actual!=null) {
            System.out.print(actual.dato+" -> ");
            actual = actual.sig;
        }
        System.out.println("null");
    }
}
