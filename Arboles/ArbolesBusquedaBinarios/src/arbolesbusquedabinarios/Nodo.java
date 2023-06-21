/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolesbusquedabinarios;

/**
 *
 * @author SALA H
 */
public class Nodo {
    int dato;
    Nodo izq;
    Nodo der;
    //Nodo ant;
    
    public Nodo (int d){
        this.dato=d;
        this.izq=null;        
        this.der=null;        
    } 

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getSig() {
        return izq;
    }

    public void setSig(Nodo sig) {
        this.izq = sig;
    }

    public Nodo getDer() {
        return der;
    }

    public void setDer(Nodo der) {
        this.der = der;
    }
}
