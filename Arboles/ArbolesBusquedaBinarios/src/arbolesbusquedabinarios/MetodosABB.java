/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolesbusquedabinarios;

import java.util.Scanner;

/**
 *
 * @author SALA H
 */
public class MetodosABB {
    Scanner entrada;
    Nodo raiz;
    
    public MetodosABB () {
        this.entrada = new Scanner(System.in);
        this.raiz = null;
    }
    
    public int menu() {
        System.out.println("");
        System.out.println("MENU PRINCIPAL");
        System.out.println("Insertar            [1]");
        System.out.println("Presentar           [2]");
        System.out.println("Eliminar            [3]");
        System.out.println("Salir               [0]");
        return entrada.nextInt();
    }
    
    public boolean arbolVacio(Nodo actual){
        return (actual==null);
    }
    
    public Nodo insertar(int num, Nodo actual) {
        if (arbolVacio(actual)) {
            Nodo nuevo = new Nodo(num);
            return nuevo;
        } else {
            if (num>actual.dato) {
                actual.der = insertar(num, actual.der);
            } else {
                actual.izq = insertar(num, actual.izq);
            }
        }
        return actual;
    }
    
    public void preOrden(Nodo actual) {
        if (actual!=null) {
            System.out.print(actual.dato+" ");
            preOrden(actual.izq);
            preOrden(actual.der);
        }
    }
    
    public void posOrden(Nodo actual) {
        if (actual!=null) {
            posOrden(actual.izq);
            posOrden(actual.der);
            System.out.print(actual.dato+" ");
        }
    }
    
    public void inOrden(Nodo actual) {
        if (actual!=null) {            
            inOrden(actual.izq);
            System.out.print(actual.dato+" ");
            inOrden(actual.der);
        }
    }
    
    public Nodo eliminar (int num, Nodo actual){
        if (arbolVacio(actual)) {
            System.out.println("No existe el elemento...");
        } else if (num> actual.dato){
            actual.der = eliminar(num,actual.der);
        } else if (num < actual.dato){
            actual.izq = eliminar(num,actual.izq);
        } else {
            Nodo aux = actual;
            if(aux.izq==null) {
                return aux.der;
            } else if (aux.der==null) {
                return aux.izq;
            } else {
                aux.dato = reemplazar(aux);
            }
        }
        return actual;
    }
    
    public int reemplazar(Nodo actual) {
        Nodo a = actual.izq;
        Nodo p = actual;
        int valor;
        while (a.der!=null) {
            p=a;
            a=a.der;
        }
        valor=a.dato;
        if (p==actual){
            p.izq=a.izq;
        } else {
            p.der=a.izq;
        }
        return valor;
    }
}
