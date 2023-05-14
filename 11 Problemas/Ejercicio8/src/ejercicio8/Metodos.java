
package ejercicio8;

public class Metodos {
    int[] miArreglo;
    
    public Metodos() {
        this.miArreglo = new int[100];
    }
    
    public void presentarArreglo(){
        for (int i=0;i<miArreglo.length;i++) {
            System.out.printf("Posición [%d]: %d^2 = %d \n"
            ,i,i+1,miArreglo[i]);
        }
    }
    
    public void calcularCuadrado () {
        for (int i=0;i<miArreglo.length;i++) {
            miArreglo[i]=(i+1)*(i+1);
        }
    }
}
