
package ejercicio1;

import java.util.Scanner;

public class Metodos {
    Scanner entrada;
    int [] miArreglo;
    
    public Metodos(int _lim) {
        this.entrada = new Scanner(System.in);
        this.miArreglo = new int [_lim];
    }
    
    public void llenar() {
        for (int i=0;i<miArreglo.length;i++) {
            System.out.print("Ingrese un número en la posición ["+i+"]: ");
            miArreglo[i]=entrada.nextInt();
        }
    }
    
    public void calcular () {
        int c=0, posi=0, neg=0;
        for (int i=0;i<miArreglo.length;i++) {
            if (miArreglo[i]>0) {
                posi++;
            } else if (miArreglo[i]==0) {
                c++;
            } else {
                neg++;
            }
        }
        presentar(posi,"positivos");
        presentar(c,"ceros");
        presentar(neg,"negativos");
    }
    
    public void presentar (int _n, String i) {
        System.out.println("Hay "+_n+" número/s "+i);
    }
}
