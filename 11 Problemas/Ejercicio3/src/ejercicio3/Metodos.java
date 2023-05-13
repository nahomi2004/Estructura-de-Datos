
package ejercicio3;

public class Metodos {
    
    int []miArreglo;
    
    public Metodos (int _n) {
        this.miArreglo = new int [_n];
    }
    
    public int fibonacci (int n) {
        if (n==0)
            return 0;
        else if (n==1)
            return 1;
        else
            return fibonacci(n-1)+fibonacci(n-2);  
    }
    
    public void llenarArreglo () {
        for (int i=0;i<miArreglo.length;i++) {
            miArreglo[i] = fibonacci(i);
        }
    }
    
    public void presentarArreglo(){
        for (int i=0;i<miArreglo.length;i++) {
            System.out.println("["+i+"]: "+miArreglo[i]);
        }
    }
}
