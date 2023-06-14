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
        System.out.println("\nInsertar            [1]: ");
        System.out.println("Eliminar            [2]: ");
        System.out.println("Reporte varones     [3]: ");
        System.out.println("Reporte damas       [4]: ");
        System.out.println("Listar              [5]: ");
        System.out.println("Salir               [0]: ");
        return entrada.nextInt();         
    }
    
    public boolean listaVacia(){
        return (head==null);
    }
    
    
    public AlumnoNodo leerDatos(){
        double [] calif = new double [3];
        
        System.out.print("\nIngrese nombre del estudiante: ");
        String nombre = entrada.next();
        System.out.print("Ingrese id del estudiante: ");
        int id = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese [m] si es una mujer o [v] si es varon");
        char sexo = entrada.nextLine().charAt(0);
        System.out.println("Ingrese las calificaciones");
        for (int i=0;i<calif.length;i++) {
            System.out.println("Calificacion ["+(i+1)+"]");
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
    
    
    public void listar(){
        if (listaVacia()) {
            System.out.println("\nNo existen elementos");
        } else {
            AlumnoNodo actual = head;
            while (actual!=null) {
                System.out.printf("\nID: %d\nNombre: %s\nSexo: %s\n",
                        actual.id,actual.nombre,actual.sexo);
                System.out.println("Calificaciones:");
                for (int i=0;i<actual.calif.length;i++) {
                    System.out.printf("Calificacion [%d]: %.2f\n", i+1 , actual.calif[i]);
                }
                System.out.println("Promedio: "+actual.Promedio());
            }
        }
    }
    
    public void reporteAprobadoSegunSexo (char x) {
        AlumnoNodo actual = head;
        while(actual!=null) {
            if (actual.sexo==x) {
                if (actual.Promedio()>=7) {
                    System.out.printf("\nID: %d\nNombre: %s\nSexo: %s\n",
                        actual.id,actual.nombre,actual.sexo);
                    System.out.println("APROBADO");
                } else {
                    System.out.printf("\nID: %d\nNombre: %s\nSexo: %s\n",
                        actual.id,actual.nombre,actual.sexo);
                    System.out.println("REPROBADO");
                }
            }
            actual=actual.sig;
        }
    }
    
    public void eliminar() {
        System.out.println("Ingrese id del estudiante:");
        int id = entrada.nextInt();
        
        if (listaVacia()) {
            System.out.println("Lista Vacia...");
        } else {
            if (id == head.id) {
                head = head.sig;
            } else {
                AlumnoNodo actual = head;
                while (actual.sig!=null && id==actual.id) {
                    actual = actual.sig;
                    if (actual.sig==null) {
                        System.out.println("No existe");
                    } else {
                        actual.sig = actual.sig.sig;
                    }
                }
            }
        }
    }
}
