/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebabimestreii;

import java.util.Scanner;

/**
 *
 * @author SALA H
 */
public class Metodos {

    Scanner entrada;
    Nodo raizA;
    Nodo raizB;
    Nodo raizC;

    public Metodos() {
        this.entrada = new Scanner(System.in);
        this.raizA = null;
        this.raizB = null;
        this.raizC = null;
    }

    public int menu() {
        System.out.println("Ingresar un cliente [1]");
        System.out.println("Presentar cliente   [2]");
        System.out.println("Salir               [0]");
        return entrada.nextInt();
    }

    public boolean arbolVacio(Nodo actual) {
        return (actual == null);
    }

    public Cliente ingresarCliente() {
        System.out.print("Ingrese su nombre: ");
        String nombre = entrada.next();
        entrada.nextLine();
        System.out.print("Ingrese su id: ");
        int id = entrada.nextInt();
        System.out.print("Ingrese su antigüedad (números enteros): ");
        int anti = entrada.nextInt();
        System.out.print("Ingrese su historial de crediticio (A, B, C): ");
        String historial = entrada.next();
        System.out.print("Ingrese su monto de compra: ");
        double monto = entrada.nextDouble();

        Cliente c = new Cliente(id, nombre, historial, anti,
                monto);
        c.setCategoria();
        c.setDescuento();
        return c;
    }

    public Nodo insertar(Cliente c, Nodo actual) {
        if (arbolVacio(actual)) {
            Nodo nuevo = new Nodo(c);
            return nuevo;
        } else {
            if (c.getId() > actual.cliente.getId()) {
                actual.der = insertar(c, actual.der);
            } else {
                actual.izq = insertar(c, actual.izq);
            }
        }
        return actual;
    }

    public void inOrden(Nodo actual) {
        if (actual != null) {
            inOrden(actual.izq);
            System.out.printf("%s\n", actual);
            inOrden(actual.der);
        }
    }
}
