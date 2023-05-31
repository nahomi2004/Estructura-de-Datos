/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alumnosasiganturas;

public class AlumnosAsiganturas {

    public static void main(String[] args) {
        
        Metodos matriz = new Metodos();
        
        matriz.llenarMatriz();
        matriz.presentarMatriz();
        
        System.out.println("MEDIA DE CADA ALUMNO:");
        for (int i=0;i<matriz.matriz.length;i++) {
            System.out.print("["+matriz.mediaAlumno()[i]+"] ");
        }
        System.out.println(" ");
        
        System.out.println("MEDIA DE CADA ASIGNATURA:");
        for (int i=0;i<2;i++) {
            System.out.print("["+matriz.mediaAsignaturas()[i]+"] ");
        }
        System.out.println("");
        
        System.out.println("Media de la Clase: "+matriz.mediaClase());
        System.out.println("Porcentaje de ceros: "+matriz.faltasExamen()+"%");
    }    
}
