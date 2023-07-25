/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebabimestreii;

/**
 *
 * @author SALA H
 */
public class Cliente {

    protected int id;
    protected int antiguedad;
    protected int descuento;
    protected String nombre;
    protected String historial;
    protected String categoria;
    protected double montoCompra;

    public Cliente(int i, String n, String h, int a, double m) {
        id = i;
        nombre = n;
        historial = h;
        antiguedad = a;
        montoCompra = m;
    }

    public int getId() {
        return id;
    }

    public void setId(int i) {
        id = i;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String i) {
        nombre = i;
    }

    public String getHistorial() {
        return historial;
    }

    public void setHistorial(String i) {
        historial = i;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public double getMontoCompra() {
        return montoCompra;
    }

    public void setMontoCompra(double montoCompra) {
        this.montoCompra = montoCompra;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        int sumaP = 0;
        
        if (historial.equals("A")) {
            sumaP += 3;
        } else if (historial.equals("B")) {
            sumaP += 2;
        } else if (historial.equals("C")) {
            sumaP += 1;
        }

        if (getMontoCompra() > 1000) {
            sumaP += 3;
        } else if (getMontoCompra() <= 1000 && getMontoCompra() >= 500) {
            sumaP += 2;
        } else if (getMontoCompra() < 500) {
            sumaP += 1;
        }

        if (getAntiguedad() > 5) {
            sumaP += 3;
        } else if (getMontoCompra() <= 5 && getMontoCompra() >= 2) {
            sumaP += 2;
        } else if (getMontoCompra() < 2) {
            sumaP += 1;
        }

        if (sumaP >= 7) {
            categoria = "A";
        } else if (sumaP < 7 && sumaP >= 3) {
            categoria = "B";
        } else if (sumaP < 3) {
            categoria = "C";
        }
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento() {
        if (categoria.equals("A")) {
            descuento = 10;
        } else if (categoria.equals("B")) {
            descuento = 6;
        } else if (categoria.equals("C")) {
            descuento = 2;
        }
    }

}
