/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolesavl;

import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class MetodosAVL {

    Nodo raiz;
    Scanner entrada;
    boolean altura; //Me indica cuando hay una nueva insercion en el arbol

    public MetodosAVL() {
        this.raiz = null;
        this.entrada = new Scanner(System.in);
        this.altura = false;
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

    public Nodo insertarAVL(int num, Nodo actual) {
        if (actual == null) {
            Nodo nuevo = new Nodo(num);
            altura = true;
            return nuevo;
        } else if (num < actual.dato) {
            actual.izq = insertarAVL(num, actual.izq);
            if (altura == true) {
                switch (actual.fe) {
                    case -1 -> {
                        Nodo nodoX = actual.izq;
                        if (nodoX.fe == -1) {
                            actual = rotarII(actual, nodoX);
                        } else {
                            actual = rotarID(actual, nodoX);
                        }
                    }
                    case 0 -> {
                        actual.fe = -1;
                    }
                    case 1 -> {
                        actual.fe = 0;
                        altura = false;
                    }
                }
            }
        } else if (num > actual.dato) {
            actual.der = insertarAVL(num, actual.der);
            switch (actual.fe) {
                    case -1 -> {
                        actual.fe = 0;
                        altura = false;                        
                    }
                    case 0 -> {
                        actual.fe = 1;
                    }
                    case 1 -> {
                        Nodo nodoX = actual.der;
                        if (nodoX.fe == 1) {
                            actual = rotarDD(actual, nodoX);
                        } else {
                            actual = rotarDI(actual, nodoX);
                        }
                    }
                }
        } else {
            System.err.println("No se aceptan repetidos :c");
            System.out.println("");
        }
        
        return actual;
    }

    public Nodo rotarII(Nodo actual, Nodo nodoX) {
        actual.izq = nodoX.der;
        nodoX.der = actual;  
        
        actual.fe = nodoX.fe = 0;
        
        return nodoX;
    }
    
    public Nodo rotarID(Nodo actual, Nodo nodoX) {
        Nodo aux = nodoX.der;
        
        actual.izq = aux.der;
        nodoX.der = aux.izq; 
        
        aux.izq = nodoX;
        aux.der = actual; 
        
        actual.fe = nodoX.fe = 0;
        
        return aux;
    }
    
    public Nodo rotarDD(Nodo actual, Nodo nodoX) {
        actual.der = nodoX.izq;
        nodoX.izq = actual;  
        
        actual.fe = nodoX.fe = 0;
        
        return nodoX;
    }
    
    public Nodo rotarDI(Nodo actual, Nodo nodoX) {
        Nodo aux = nodoX.izq;
        
        actual.der = aux.izq;
        nodoX.izq = aux.der; 
        
        aux.der = nodoX;
        aux.izq = actual; 
        
        actual.fe = nodoX.fe = 0;
        
        return aux;
    }
    
    /*public Nodo eliminar (int num, Nodo actual){
        
    }*/
    
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
            System.out.printf("%d [%d] - ",actual.dato, actual.fe);
            inOrden(actual.der);
        }
    }
}
