/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alumnoo;

/**
 *
 * @author Nahomi Cabrera
 */
public class AlumnoNodo extends Persona {
    private double [] calif;
    AlumnoNodo sig;

    public AlumnoNodo(int i, String n, char se,double[] c) {
        super(i,n,se);
        this.calif = c;
        this.sig = null;
    }
    // Este constructor se usa para poder crear y devolver un alumno.
    // Es algo básico pero que me sirvió para la función comprobar ID.
    public AlumnoNodo(int i, String n, char se) {
        super(i,n,se);
        this.sig = null;
    }
    
    public double Promedio() {
        double suma=0;
        for(double nota : calif) {
            suma+=nota;
        }
        return suma/3;
    }

    public double[] getCalif() {
        return calif;
    }

    public void setCalif(double[] calif) {
        this.calif = calif;
    }
}
