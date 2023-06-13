/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alumnoo;

/**
 *
 * @author UTPL
 */
public class AlumnoNodo extends Persona {
    double [] calif;
    AlumnoNodo sig;

    public AlumnoNodo(int i, String n, char se,double[] c) {
        super(i,n,se);
        this.calif = c;
        this.sig = null;
    }
    
    public double Promedio() {
        double suma=0;
        for(double nota : calif) {
            suma+=nota;
        }
        return suma/3;
    }
}
