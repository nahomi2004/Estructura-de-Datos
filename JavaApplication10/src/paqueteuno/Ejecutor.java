
package paqueteuno;

public class Ejecutor {

    public static void main(String[] args) {
        
        MetodosArreglos arreglo1 = new MetodosArreglos();
        int []x = new int [5];
        int n = 0;
        
        arreglo1.llenarArreglo(x, n);
        arreglo1.presentarArreglo(x, n);
        arreglo1.eliminarNum(x, n);
        System.out.printf("%d ",arreglo1.busquedaArreglo(x,2));
        arreglo1.presentarArreglo(x, n);
        arreglo1.ordenarMayorArreglo(x, n);
        arreglo1.ordenarMenorArreglo(x, n);
    }
    
}
