
package ejercicio6;

import java.util.Scanner;

public class Metodos {
    Scanner entrada;
    int [] miArreglo;
    double [] miArreglo2;
    
    public Metodos(int _lim) {
        this.entrada = new Scanner(System.in);
        this.miArreglo = new int [_lim];
        this.miArreglo2 = new double [_lim];
    }
    
    public void llenar() {
        for (int i=0;i<miArreglo.length;i++) {
            miArreglo[i]=(int) (-10+(Math.random()*100));
            if (miArreglo[i]==0) {
                i--;
            }
        }
    }
    
    public void dividir(int _n) {
        if (_n<miArreglo.length) {
            for (int i=0;i<miArreglo.length;i++) {
                miArreglo2[i]= ((double)miArreglo[i]/miArreglo[_n]);
            }
            System.out.println("ARREGLO 1");
            presentarArreglo(miArreglo);
            System.out.println("\nARREGLO 2");
            presentarArreglo(miArreglo2);
            System.out.println("");
        } else {
            System.out.println("El número no se ha encontrado y no se puede"
                    + " llenar el arreglo 2");
        }
    }
    
    public void presentarArreglo(int []x){
        for (int i=0;i<x.length;i++) {
            System.out.print("["+i+"]:"+x[i]+" ");
        }
    }
    
    public void presentarArreglo(double []x){
        for (int i=0;i<x.length;i++) {
            System.out.printf("[%d]:%.2f ", i, x[i]);
        }
    }
}
