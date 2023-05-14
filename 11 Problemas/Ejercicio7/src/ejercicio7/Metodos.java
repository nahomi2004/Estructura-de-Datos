
package ejercicio7;

import java.util.Scanner;

public class Metodos {
    Scanner entrada;
    int[] miArreglo;
    
    public Metodos(int _lim) {
        this.entrada = new Scanner(System.in);
        this.miArreglo = new int[_lim];
    }
    public void llenarArreglo() {
        for (int i=0;i<miArreglo.length;i++) {
            System.out.print("Ingrese un número en la posición ["+i+"]:");
            miArreglo[i]=entrada.nextInt();
        }
    }
    
    public void presentarArreglo(int []x){
        for (int i=0;i<miArreglo.length;i++) {
            System.out.println("["+i+"]: "+miArreglo[i]);
        }
    }
    
    public int[] recorrerDerecha (int _k, int _n) {
        for (int i=miArreglo.length-1;i>_k;i--) {
            miArreglo[i]=miArreglo[i-1];
        }
        miArreglo[_k]=_n;
        return miArreglo;   
    }
    
    public void insertarNumero(int _k) {
        int n;
        System.out.println("Ingrese el número a insertar");
        n = entrada.nextInt();     
        
        presentarArreglo(recorrerDerecha(_k,n));
    }
}
