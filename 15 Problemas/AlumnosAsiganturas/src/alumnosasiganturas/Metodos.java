/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alumnosasiganturas;

import java.util.Scanner;

/**
 *
 * @author D E L L
 */
public class Metodos {
    /*  Cada alumno de una clase de 20 estudiantes tiene notas correspondientes 
        a 5 asignaturas diferentes, pudiendo no tener calificación en alguna 
        asignatura. A cada asignatura le corresponde un determinado coeficiente.
        Escribir un programa que permita:
            a. Calcular la media de cada alumno
            b. Media general de la clase
            c. Media de la clase en cada asignatura
            d. Porcentaje de faltas (no presentado a examen)
    */
    
    Scanner entrada;
    int [][] matriz;
    int [] vA;
    int [] vM;
    int f = 20;
    int c = 5;
    
    public Metodos () {
        entrada = new Scanner(System.in);
        matriz = new int [f][c];
        vA = new int [f];
        vM = new int [c];
    }
    
    public void llenarMatriz () { 
        for (int i=0;i<f;i++) {
            for (int j=0;j<c;j++) {
                System.out.print("Alumno ["+(i+1)+"] Nota examen en la Asignatura ["+(j+1)+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
    }
    
    public void presentarMatriz () {
        for (int i=0;i<f;i++) {
            System.out.println("Alumno "+(i+1));
            for (int j=0;j<c;j++) {
                System.out.print("Asignatura "+(j+1)+": ");
                System.out.print("["+matriz[i][j]+"] ");
            }
            System.out.println("");
        }
    }
    
    public int[] mediaAlumno () {
        int suma = 0; 
        for (int i=0;i<f;i++){
            suma = 0;
            for (int j=0;j<c;j++){
                suma+=matriz[i][j];
            }
            vA[i] = suma/c;
        }
        return vA;
    }
    
    public int[] mediaAsignaturas () {
        int suma = 0; 
        for (int i=0;i<c;i++){
            suma = 0;
            for (int j=0;j<f;j++){
                suma+=matriz[j][i];
            }
            vM[i] = suma/f;
        }
        return vM;
    }
    
    public int mediaClase () {
        int suma=0;
        for (int i=0;i<f;i++){
            for (int j=0;j<c;j++){
                suma+=matriz[i][j];
            }
        }
        int media = suma/(f*c);
        return media;
    } 
    
    public double faltasExamen () {
        int cont=0;
        for (int i=0;i<f;i++){
            for (int j=0;j<c;j++){
                if (matriz[i][j]==0) {
                    cont+=matriz[i][j];
                }
            }
        }
        return (cont*100)/20;
    }
}
