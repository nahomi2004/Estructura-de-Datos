
package ejercicio10;

import java.util.Scanner;

public class Metodos {
    Scanner entrada;
    Fumadores[] arreglo1;
    NoFumadores[] arreglo2;
    int evF;
    int evNF;
    
    public Metodos() {
        this.entrada = new Scanner(System.in);
        this.arreglo1 = new Fumadores [30];
        this.arreglo2 = new NoFumadores [70];
        evF = 0;
        evNF = 0;
    }
    
    public int menu() {
        int opc;
        System.out.println("\nBIENVENIDOS A AEROLINEAS SAN FRANCISCO\n");
        System.out.println("Hacer una reserva [1]");
        System.out.println("Cancelar una reserva [2]");
        System.out.println("Salir [0]");
        opc = entrada.nextInt();
        return opc;
    }
    
    public void llenarFumadores() {
        String nombre;
        String apellido;
        String id;
        if (evF<arreglo1.length) {
            System.out.println("Ingrese su nombre:");
            nombre = entrada.next();
            System.out.println("Ingrese su apellido:");
            apellido = entrada.next();
            System.out.println("Ingrese el número de cédula:");
            id = entrada.next();
            arreglo1[evF] = new Fumadores(nombre,apellido,id);
            evF++;
        } else {
            System.out.println("No hay espacios disponibles");
        }
        
    }
    
    public void llenarNoFumadores() {
        String nombre;
        String apellido;
        String id;
        if (evNF<arreglo2.length) {
            System.out.println("Ingrese su nombre:");
            nombre = entrada.next();
            System.out.println("Ingrese su apellido:");
            apellido = entrada.next();
            System.out.println("Ingrese el número de cédula:");
            id = entrada.next();
            arreglo2[evNF] = new NoFumadores(nombre,apellido,id);
            evNF++;
        } else {
            System.out.println("No hay espacios disponibles");    
        }        
    }
    
    public int buscarFumadores (String _id) {
        for (int i=0;i<arreglo1.length;i++) {
            if (arreglo1[i]==null) {
                return -1;
            }
            if (_id.equalsIgnoreCase(arreglo1[i].id)) {
                return i;
            }
        }
        return -1;
    }
    
    public int buscarNoFumadores (String _id) {
        for (int i=0;i<arreglo2.length;i++) {
            if (arreglo2[i]==null) {
                return -1;
            }
            if (_id.equalsIgnoreCase(arreglo2[i].id)) {
                return i;
            }
        }
        return -1;
    }
    
    public Fumadores[] recorrerIzquierdaFumadores(int _n) {
        for (int i=_n;i<evF-1;i++) {
            arreglo1[i]=arreglo1[i+1];
        }
        evF--;
        return arreglo1;   
    }
    
    public NoFumadores[] recorrerIzquierdaNoFumadores(int _n) {
        for (int i=_n;i<evNF-1;i++) {
            arreglo2[i]=arreglo2[i+1];
        }
        evNF--;
        return arreglo2;   
    }
    
    public void eliminarFumadores (String _id) {
        int i = buscarFumadores(_id);
        if (i!=-1) {
            recorrerIzquierdaFumadores(i);
            arreglo1[arreglo1.length-1]=null;
            System.out.println("La reserva se ha eliminado exitosamente");
        } else {
            System.out.println("Nunca se realizó una reserva");
        }
    }
    
    public void eliminarNoFumadores (String _id) {
        int i = buscarNoFumadores(_id);
        if (i!=-1) {
            recorrerIzquierdaNoFumadores(i);
            arreglo2[arreglo2.length-1]=null;
            arreglo2[i]=null;
            System.out.println("La reserva se ha eliminado exitosamente");
        } else {
            System.out.println("Nunca se realizó una reserva");
        }
    }
    
    
}
