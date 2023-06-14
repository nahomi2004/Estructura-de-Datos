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
    int [] miPila;
    int tope;
    
    public MetodosPilas (int _lim) {
        this.entrada = new Scanner(System.in);
        this.miPila = new int [_lim];
        this.tope = -1;
    }
    
    public int menu() {
        System.out.println("MENU PRINCIPAL");
        System.out.println("Push       [1]");
        System.out.println("Pop        [2]");
        System.out.println("Salir      [0]");
        return entrada.nextInt();
    }
    
    public boolean pilaLlena() {
        if (tope==miPila.length-1) 
            return true;
        else
            return false;
    }
    
    public boolean pilaVacia() {
        if (tope==-1)
            return true;
        else 
            return false;
    }
    
    public void push() {
        if (!pilaLlena()) {
            System.out.println("Ingrese el elemento");
            tope++;
            miPila[tope] = entrada.nextInt();            
        } else {
            System.out.println("No hay espacio");
        }
    }
    
    public void pop() {
        if (!pilaVacia()) {
            System.out.println("El elemento es: "+miPila[tope]);
            tope--;
        } else {
            System.out.println("Pila vacia");
        }
    }
}
