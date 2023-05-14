
package ejercicio9;

import java.util.Scanner;

public class Metodos {
    int[] miArreglo;
    Scanner entrada;
    
    public Metodos(int _n) {
        this.miArreglo = new int[_n];
        this.entrada = new Scanner(System.in);
    }
    
    public void llenarArreglo() {
        for (int i=0;i<miArreglo.length;i++) {
            System.out.print("Ingrese un número en la posición ["+i+"]:");
            miArreglo[i]=entrada.nextInt();
            if (miArreglo[i]==0) {
                System.out.println("Ingrese un número diferente de cero");
                i--;
            }
        }
    }
    
    public int sumaPares(){
        int conp = 0;
        for (int i=0;i<miArreglo.length;i++) {
            if (miArreglo[i]%2==0) {
                conp++;
            }
        }
        return conp;
    }
    
    public int sumaImpares(){
        int coni = 0;
        for (int i=0;i<miArreglo.length;i++) {
            if (miArreglo[i]%2!=0) {
                coni++;
            }
        }
        return coni;
    }
    
    public void presentarArreglo(){
        for (int i=0;i<miArreglo.length;i++) {
            System.out.println("["+i+"]: "+miArreglo[i]);
        }
    }
    
    @Override
    public String toString () {
        String cadena = String.format("Hay %d números impares \nHay"
                + " %d números pares\n",sumaImpares(),sumaPares());
        return cadena;
    }

}
