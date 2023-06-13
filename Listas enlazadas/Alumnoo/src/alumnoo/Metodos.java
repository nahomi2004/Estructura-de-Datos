/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alumnoo;

import java.util.Scanner;

/**
 *
 * @author SALA H
 */
public class Metodos {
    AlumnoNodo head;
    AlumnoNodo tail;
    Scanner entrada;
    
    public Metodos(){
        this.head=null;
        this.entrada=new Scanner(System.in);
    }
    
    public int menu (){
        System.out.println("\nInsertar          [1]: ");
        System.out.println("Eliminar            [2]: ");
        System.out.println("Reporte varones     [3]: ");
        System.out.println("Reporte damas       [4]: ");
        System.out.println("Listar              [5]: ");
        System.out.println("Salir               [0]:");
        return entrada.nextInt();         
    }
    
    public boolean listaVacia(){
        return (head==null);
    }
    
    
    public AlumnoNodo leerDatos(){
        double [] calif = new double [3];
        
        System.out.print("Ingrese nombre del estudiante: ");
        String nombre = entrada.nextLine();
        System.out.print("Ingrese id del estudiante: ");
        int id = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese [s] si es una mujer o [v] si es varon");
        char sexo = entrada.nextLine().charAt(0);
        System.out.println("Ingrese las calificaciones");
        for (int i=0;i<calif.length;i++) {
            System.out.println("Calificacion ["+i+"]");
            calif[i] = entrada.nextDouble();
        }     
        
        AlumnoNodo nuevo = new AlumnoNodo(id,nombre,sexo,calif);
        
        return nuevo;
    }
    
    public void insertar(){
        AlumnoNodo nuevo = leerDatos();
        if (listaVacia()) {
            head = nuevo;
            tail = nuevo;
        } else {
            if (nuevo.id<head.id) {
                nuevo.sig = head;
                head = nuevo;
            } else {
                AlumnoNodo actual = head;
                
                while (actual.sig!=null && nuevo.id>actual.sig.id) {
                    actual = actual.sig;
                    
                nuevo.sig = actual.sig;
                actual.sig = nuevo;
                if (nuevo.sig==null) {
                    tail = nuevo;
                }
                }
            }
        }
    }
    
    
    public void recorrer(){
        AlumnoNodo actual=head;
        while(actual!=null){
            System.out.print(actual.dato+"->");
            actual=actual.sig;  
        }
    }
    
    public void insInicio() {
        int num;
        System.out.print("Ingrese dato: ");
        num = entrada.nextInt();
        AlumnoNodo nuevo = new AlumnoNodo(num);
        if (listaVacia()) {
            head = nuevo;
            tail = nuevo;
        } else {
            nuevo.sig = head;
            head = nuevo;
        }
    }
    
    public void insOrdenado() {
        int num;
        System.out.print("Ingrese dato: ");
        num = entrada.nextInt();
        AlumnoNodo nuevo = new AlumnoNodo(num);
        if (listaVacia()) {
            head = nuevo;
            tail = nuevo;
        } else {
            if (num<head.dato) {
                nuevo.sig = head;
                head = nuevo;
            } else {
                Nodo actual = head;
                while (actual.sig!=null && num>actual.sig.dato) {
                    actual = actual.sig;
                    nuevo.sig = actual.sig;
                    actual.sig = nuevo;
                    if (nuevo.sig==null) {
                        tail = nuevo;
                    }
                }
            }
        }
    }
    
    public void eliminar() {
        int num;
        System.out.print("Ingrese dato: ");
        num = entrada.nextInt();
        AlumnoNodo nuevo = new AlumnoNodo(num);
        if (listaVacia()) {
            head = nuevo;
            tail = nuevo;
        } else {
            if (num==head.dato) {
                if (head.sig==null) {
                    tail=null;
                }
                head=head.sig;
            } else {
                AlumnoNodo actual = head;
                while (actual.sig!=null && actual.sig.dato!=num) {
                    actual=actual.sig;
                }
                if (actual.sig==tail) {
                    tail = actual;
                }
                if (actual.sig!=null) {
                    actual.sig = actual.sig.sig;
                } else {
                    System.out.println("No está :("); 
                }
                
            }
        }
    }
}
