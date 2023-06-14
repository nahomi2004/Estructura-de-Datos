/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas;

/**
 *
 * @author SALA H
 */
public class Nodo {
    int dato;
    Nodo sig;
    Nodo ant;
    
    public Nodo (int d){
        this.dato=d;
        this.sig=null;
       
       } 

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }

    public Nodo getAnt() {
        return ant;
    }

    public void setAnt(Nodo ant) {
        this.ant = ant;
    }
}

/*  es casi como tail pero con ant
    Para insertar solo se ve si ant es null
    para insertar final  tail.sig = nuevo  nuevo.ant=tail  tail = nuevo
    para insertar en null seria head = nuevo  tail = nuevo
    para insertar al principio nuevo.sig = head  head.ant = nuevo  head = nuevo*/