
package ejercicio2;

public class Metodos {
    
    int[] miArreglo = new int [] {1,2,3,4,5,6};
    long[] miArreglo2 = new long [miArreglo.length];
    // long es un tipo de variable que me ayudará a calcular números muuuuy
    // largos porque int tiene un rango de un poco menos de menos 2mil millones
    // hasta un poco más de 2mil millones. En cambio long tiene un rango de
    // menos nueve quintillones hasta nueve quintillones, aproximadamente.
    public long factorial(int n) {
        if (n==0)
            return 1;
        else 
            return n*factorial(n-1);
    }
    
    public void presentarArreglo(){
        System.out.println("ARREGLO 1");
        for (int i=0;i<miArreglo.length;i++) {
            System.out.print("["+i+"]: "+miArreglo[i]+" ");
        }
        
        System.out.println("\nARREGLO 2");
        for (int i=0;i<miArreglo2.length;i++) {
            System.out.print("["+i+"]: "+miArreglo2[i]+" ");
        }
    }
    
    public void factorialArreglo() {
        for (int i=0;i<miArreglo.length;i++) {
            miArreglo2[i]=factorial(miArreglo[i]);
        }
    }
}
