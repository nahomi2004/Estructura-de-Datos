
package ejercicio4;

public class Metodos {
    
    int []miArreglo;
    
    public Metodos (int _n) {
        this.miArreglo = new int [_n];
    }    
    
    public static boolean esPrimo(int numero){
        int contador = 2;
        boolean primo=true;
        while ((primo) && (contador!=numero)){
          if (numero % contador == 0)
            primo = false;
          contador++;
        }
        return primo;
    }
    
    public void llenarArreglo () {
        int j=1;
        for (int i=0;i<miArreglo.length;i++) {
            if (esPrimo(j)==true) {
                miArreglo[i]=j;
            } else {
                i--;
            }
            j++;
        }
    }
    
    public void presentarArreglo(){
        for (int i=0;i<miArreglo.length;i++) {
            System.out.println("["+i+"]: "+miArreglo[i]);
        }
    }
}
