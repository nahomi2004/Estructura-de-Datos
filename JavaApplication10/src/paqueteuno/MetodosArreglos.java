package paqueteuno;

import java.util.Scanner;

public class MetodosArreglos {
    //Elabore un programa que permita realizar las operaciones básicas
    // (lectura, ordenamiento, búsqueda, eliminación y presentación)
    // sobre matrices unidimensionales.
    Scanner entrada;
    
    public MetodosArreglos () {
        this.entrada = new Scanner (System.in);
    }
    
    public int[] llenarArreglo(int []x, int n) {
        for(int i=0;i<x.length;i++) {
            System.out.println("Ingrese un número entero en el arreglo"
                    + " en la posición:\n ["+i+"]");
            x[i]=entrada.nextInt();
            n++;
        }
        return x;
    }
    
    public void presentarArreglo(int []x, int n) {
        for(int i=0;i<n;i++) {
            System.out.println("["+x[i]+"]");
        }
    }
    
    public int busquedaArreglo(int []x, int num) {
        for(int i=0;i<x.length;i++) {
            if(x[i]==num) {
                return i;
            }
        }
        return -1;
    }
    
    public void eliminarNum(int []x, int n) {
        System.out.println("¿Qué número desea eliminar?");
        int num = entrada.nextInt();
        int a = busquedaArreglo(x,num);
        if (a!=-1){
            recorrerIzquierda(x,n,a);
            System.out.println("El número se eliminó correctamente");
        } else {
            System.out.println("El número no se pudo eliminar o no se "
                    + "encuentra en el arreglo");
        }
    }
    
    public void recorrerIzquierda(int []x, int n, int num) {
        for(int i=num;i<n-1;i++) 
            x[i]=x[i+1];
        n--;
        x[n]=0;
    }
    
    public void ordenarMenorArreglo(int []x, int n) {
        int aux;
        for(int i=0;i<n-1;i++) {
            for(int j=0;j<n;i++) {
                if (x[i]>x[j]) {
                    aux = x[i];
                    x[i] = x[j];
                    x[j] = aux;
                }
            }
        }
        presentarArreglo(x,n);
    }
    
    public void ordenarMayorArreglo(int []x, int n) {
        int aux;
        for(int i=0;i<n-1;i++) {
            for(int j=0;j<n;i++) {
                if (x[i]<x[j]) {
                    aux = x[i];
                    x[i] = x[j];
                    x[j] = aux;
                }
            }
        }
        presentarArreglo(x,n);
    }
}
