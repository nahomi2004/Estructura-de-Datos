
package ejercicio5;

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
    
    public String ordenadoMayor () {
        String vf;
        for (int i=0; i<miArreglo.length-1; i++) {
            for (int j=i+1; j<miArreglo.length; j++) {
                if (miArreglo[i]<miArreglo[j]) {
                    return vf = "El arreglo no está ordenado";
                }
            }
        }
        return vf = "El arreglo está ordenado de mayor a menor";
    }
    
    public String ordenadoMenor () {
        String vf;
        for (int i=0; i<miArreglo.length-1; i++) {
            for (int j=i+1; j<miArreglo.length; j++) {
                if (miArreglo[i]>miArreglo[j]) {
                    return vf = "El arreglo no está ordenado";
                }
            }
        }
        return vf = "El arreglo está ordenado de menor a mayor";
    }
}
