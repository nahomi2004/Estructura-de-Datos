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
        System.out.println("Push                [1]");
        System.out.println("Pop                 [2]");
        System.out.println("Ppresentar lista    [3]");
        System.out.println("Salir               [0]");
        return entrada.nextInt();
    }
    
    public boolean arbolVacio(){
        return (raiz==null);
    }
    
    public void insertar() {
        
    }
    
    public void preOrden() {
        
    }
    
    public void posOrden() {
        
    }
    
    public void inOrden() {
        
    }
}
