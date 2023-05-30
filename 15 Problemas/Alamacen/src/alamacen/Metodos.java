/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alamacen;

import java.util.Scanner;

/**
 *
 * @author D E L L
 */
public class Metodos {
    /*  Una empresa tiene diez almacenes y desea un programa que lea sus ventas 
        trimestrales y calcule:
        a. La media de las ventas mensuales para cada uno de sus almacenes
        b. Obtener un listado de los almacenes cuyas ventas mensuales son superiores a la media
           total (índice del almacén)
        c. Muestre cuál de los meses ha sido el más productivo y cuál el menos productivo.
    */
    
    Scanner entrada = new Scanner (System.in);
    int [][] matriz;
    // int [] vF;
    int [] vC;
    int f = 5;
    int c = 3;
    
    public Metodos () {
        entrada = new Scanner(System.in);
        matriz = new int [f][c];
        vC = new int [c];
    }
    
    public void llenarMatriz () { 
        for (int i=0;i<matriz.length;i++) {
            for (int j=0;j<matriz[i].length;j++) {
                System.out.print("Almacen: ["+(i+1)+"] Mes: ["+(j+1)+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
    }
    
    public void presentarMatriz () {
        for (int i=0;i<matriz.length;i++) {
            System.out.println("Almacen "+(i+1)+":");
            for (int j=0;j<matriz[i].length;j++) {
                System.out.print("Mes "+(j+1)+": ");
                System.out.print("["+matriz[i][j]+"] ");
            }
            System.out.println("");
        }
    }
    
    public int[] sumarColumnas () {
        int suma = 0; 
        for (int i=0;i<c;i++){
            suma = 0;
            for (int j=0;j<matriz.length;j++){
                suma+=matriz[j][i];
            }
            vC[i] = suma/f;
        }
        return vC;
    }
    
    public String [] superiorMedia () {
        String [] vSM = new String [c*f];
        // String cadena;
        for (int i=0;i<c;i++){
            for (int j=0;j<matriz.length;j++){
                if (vC[i]< matriz[j][i]) {
                    vSM[i] = String.format("[%d] [%d]", j,i);
                }
            }
            
        }
        return vSM;
    }
    
    public int mesMasProductivo () {
        int suma = 0; 
        int aux = 0;
        for (int i=0;i<c;i++){
            suma = 0;
            for (int j=0;j<matriz.length;j++){
                suma+=matriz[j][i];
            }
            vC[i] = suma;
            
            if ((i+1)>=c) {
                break;
            } else if (vC[i]<vC[i+1]) {
                aux = i+1;
            }
        }        
        return aux;
    }
}
