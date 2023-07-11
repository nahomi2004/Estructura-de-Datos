/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolesavl;

/**
 *
 * @author UTPL
 */
public class Nodo {

    int dato;
    int fe;
    Nodo izq;
    Nodo der;
    //Nodo ant;

    public Nodo(int d) {
        this.dato = d;
        this.izq = null;
        this.der = null;
        this.fe = 0;
    }
}
