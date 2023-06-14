/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colaspilas;

import java.util.Scanner;

/**
 *
 * @author SALA H
 */
public class MetodosColas {
    Scanner entrada;
    int [] miPila;
    int tope;
    int i;
    
    public MetodosColas (int _lim) {
        this.entrada = new Scanner(System.in);
        this.miPila = new int [_lim];
        this.tope = -1;
        this.i = 0;
    }
    
    public int menu() {
        System.out.println("MENU PRINCIPAL PARA COLAS");
        System.out.println("Push       [1]");
        System.out.println("Pop        [2]");
        System.out.println("Salir      [0]");
        return entrada.nextInt();
    }
    
    public boolean colaLlena() {
        if (tope==miPila.length-1) 
            return true;
        else
            return false;
    }
    
    public boolean colaVacia() {
        if (tope==-1)
            return true;
        else 
            return false;
    }
    
    public void push() {
        if (!colaLlena()) {
            System.out.println("Ingrese el elemento");
            tope++;
            miPila[tope] = entrada.nextInt();            
        } else {
            System.out.println("No hay espacio");
        }
    }
    
    public void pop() {
        if (!colaVacia()) {
            System.out.println("El elemento es: "+miPila[i]);
            i++;
            tope--;
        } else {
            System.out.println("Cola vacia");
        }
    }
}

