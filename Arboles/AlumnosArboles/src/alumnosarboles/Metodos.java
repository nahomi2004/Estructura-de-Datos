/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alumnosarboles;

import java.util.Scanner;

/**
 *
 * @author SALA H
 */
public class Metodos {
    Scanner entrada;
    AlumnoArbol raizMujeres;
    AlumnoArbol raizVarones;
    AlumnoLista head;

    public Metodos() {
        this.entrada = new Scanner(System.in);
        this.raizMujeres = null;
        this.raizVarones = null;
        this.head = null;
    }
    public int menu() {
        System.out.println("");
        System.out.println("      MENU PRINCIPAL");
        System.out.println("Insertar lista                  [1]");
        System.out.println("Recorrer lista                  [2]");
        System.out.println("Crear arboles                   [3]");
        System.out.println("Presentar arbol de damas        [4]");
        System.out.println("Presentar arbol de varones      [5]");
        System.out.println("Reporte de damas aprobadas      [6]");
        System.out.println("Reporte de damas reprobadas     [7]");
        System.out.println("Reporte de varones aprobados    [8]");        
        System.out.println("Reporte de varones reprobados   [9]");
        System.out.println("Salir                           [0]");
        return entrada.nextInt();
    }
    
    public boolean arbolVacio(AlumnoArbol actual){
        return (actual==null);
    }
    
    public boolean listaVacia(){
        return (head==null);
    }
    
    public AlumnoLista leerDatos(){
        double [] calif = new double [3];
        AlumnoLista nuevo=null;
                
        System.out.print("\nIngrese nombre del estudiante: ");
        String nombre = entrada.next();
        entrada.nextLine();
        System.out.print("Ingrese id del estudiante: ");
        int id = entrada.nextInt();
        AlumnoLista aux = comprobrarID(id);
        
        if (aux!=null) {
            System.err.println("No se pudo crear al estudiante...");
            System.out.println("");
            System.out.printf("Este ID ya está ingresado, el estudiante "
                    + "perteneciente al él es:\nNombre: [%s]\nID: [%d]\nSexo: [%s]\n",
                    aux.nombre, aux.id, aux.sexo);
            return nuevo;
            
        } else {
            
            entrada.nextLine();
            System.out.println("Ingrese [m] si es mujer o [v] si es varon");
            char sexo = entrada.nextLine().charAt(0);

            if (sexo=='m' || sexo=='v') {
                System.out.println("Ingrese las calificaciones");
                for (int i=0;i<calif.length;i++) {
                    System.out.print("Calificacion ["+(i+1)+"]: ");
                    calif[i] = entrada.nextDouble();
                }
                
                nuevo = new AlumnoLista(id,nombre,sexo,calif);
            } else {
                System.err.println("Ingrese 'v' o 'm', por favor. Inténtelo de nuevo");
            }
        }        
        return nuevo;
    }
    
    public AlumnoLista comprobrarID (int i) {
        AlumnoLista aux=null;
        if (listaVacia()) {
            return aux;
        } else {
            AlumnoLista actual = head;
            while (actual!=null) {
                if (i==actual.id) {
                    String nombre = actual.nombre;
                    int id = actual.id;
                    char sexo = actual.sexo;
                    aux = new AlumnoLista(id, nombre, sexo);
                }
                actual = actual.sig;
            }
        }
        return aux;
    }
    
    public void insertar(){
        AlumnoLista nuevo = leerDatos();
        nuevo.sig = head;
        head = nuevo;
    }
    
    public void listar(){
        if (listaVacia()) {
            System.out.println("");
            System.err.println("No existen elementos");
        } else {
            AlumnoLista actual = head;
            System.out.println("");
            while (actual!=null) {
                System.out.printf("ID: %d - Nombre: %s - Sexo: %s\n",
                        actual.id,actual.nombre,actual.sexo);
                System.out.println("             ↓");
                actual=actual.sig;
            }
            System.out.println("           null");
        }
    }
    
    public AlumnoArbol insertar(AlumnoArbol actual, AlumnoArbol nuevo) {
        if (arbolVacio(actual)) {
            return nuevo;
        } else {
            if (nuevo.id>actual.id) {
                raizMujeres = insertar(actual.der, nuevo);
            } else {
                raizVarones = insertar(actual.izq, nuevo);
            }
        }
        return actual;
    }
    
    public void crearArboles() {
        AlumnoLista actual = head;
        AlumnoArbol nuevo;
        while (actual!=null){
            nuevo = new AlumnoArbol(actual.id, actual.nombre, actual.sexo, actual.Promedio());
            if (nuevo.sexo=='m') {
                raizMujeres = insertar(raizMujeres,nuevo);
            } else {
                raizVarones = insertar(raizVarones,nuevo);
            }
            actual = actual.sig;
        }
    }
    
    public void inOrden(AlumnoArbol actual) {
        if (actual!=null) {            
            inOrden(actual.izq);
            System.out.print("Nombre: "+actual.nombre+" - Id: "+actual.id+" - Sexo: "+actual.sexo);
            System.out.println("           \n↓");
            inOrden(actual.der);
        }
    }
    
    public void reporteInOrdenAprobados(AlumnoArbol actual) {
        if (actual!=null && actual.id>=7) {            
            inOrden(actual.izq);            
            System.out.print("Nombre: "+actual.nombre+" - Id: "+actual.id+" - Sexo: "+actual.sexo);
            System.out.println("Promedio: "+actual.promedio);
            System.out.println("             ↓");                      
            inOrden(actual.der);
        }
    }
    
    public void reporteInOrdenReprobados(AlumnoArbol actual) {
        if (actual!=null && actual.id<=7) {            
            inOrden(actual.izq);
            System.out.print("Nombre: "+actual.nombre+" - Id: "+actual.id+" - Sexo: "+actual.sexo);
            System.out.println("Promedio: "+actual.promedio);
            System.out.println("             ↓");                      
            inOrden(actual.der);
        }
    }
}
