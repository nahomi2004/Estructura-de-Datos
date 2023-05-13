package paqueteuno;

import java.util.Scanner;

public class MetodosArreglos {
    //Elabore un programa que permita realizar las operaciones básicas
    // (lectura, ordenamiento, búsqueda, eliminación y presentación)
    // sobre matrices unidimensionales.
    
    Scanner entrada;
    int[] miArreglo;
    int ev;
    
    public MetodosArreglos(int _n) {
        this.entrada = new Scanner(System.in);
        this.miArreglo = new int[_n];
        this.ev = 0;
    }
    
    public int menu() {
        System.out.println("¿QUÉ DESEA HACER CON SU ARREGLO?");
        System.out.println("Llenar el arreglo [1]");
        System.out.println("Ordenar el arreglo [2]");
        System.out.println("Buscar un número en el arreglo [3]");
        System.out.println("Eliminar un número en el arreglo [4]");
        System.out.println("Presentar el arreglo [5]");
        System.out.println("Salir [0]\n");
        return entrada.nextInt();
    }
    
    public void llenarArreglo() {
        for (int i=0;i<miArreglo.length;i++) {
            System.out.print("Ingrese un número en la posición ["+i+"]:");
            miArreglo[i]=entrada.nextInt();
            ev++;
        }
    }
    
    public void presentarArreglo(int []x){
        for (int i=0;i<ev;i++) {
            System.out.println("["+i+"]: "+miArreglo[i]);
        }
    }
    
    public int[] ordenarArregloMayor() {
        int aux;
        for (int i=0;i<ev-1;i++) {
            for (int j=i+1;j<ev;j++) {
                if (miArreglo[j]>miArreglo[i]){
                    aux = miArreglo[i];
                    miArreglo[i] = miArreglo[j];
                    miArreglo[j]=aux;
                }    
            }
        }
        return miArreglo;
    }
    
    public int[] ordenarArregloMenor() {
        int aux;
        for (int i=0;i<ev-1;i++) {
            for (int j=i+1;j<ev;j++) {
                if (miArreglo[j]<miArreglo[i]){
                    aux = miArreglo[i];
                    miArreglo[i] = miArreglo[j];
                    miArreglo[j]=aux;
                }    
            }
        }
        return miArreglo;
    }
    
    public int buscarNumero(int _n) {
        for (int i=0;i<ev-1;i++) {
            if (miArreglo[i]==_n) {
                return i;
            }
        }
        return -1;
    }
}
