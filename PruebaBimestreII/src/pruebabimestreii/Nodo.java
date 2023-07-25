/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebabimestreii;

/**
 *
 * @author SALA H
 */
public class Nodo {

    Nodo izq;
    Nodo der;
    Cliente cliente;
    //Nodo ant;

    public Nodo(Cliente c) {
        this.cliente = c;
        this.izq = null;
        this.der = null;
    }

    /*
    public Cliente(int i, String n, char h, int a, double m) {
        id = i;
        nombre = n;
        historial = h;
        antiguedad = a;
        montoCompra = m;
    }
     */
    @Override
    public String toString() {
        String cadena = String.format("Id: %d\n"
                + "Nombre: %s\n"
                + "Descuento a aplicar: %d\n",
                cliente.getId(),
                cliente.getNombre(),
                cliente.getDescuento());

        return cadena;
    }
}
