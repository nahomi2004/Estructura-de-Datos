
package ejercicio11;

import java.util.Scanner;

public class Metodos {
    Alumno[] miArreglo;
    
    public Metodos(int _n) {
        this.miArreglo = new Alumno[_n];
    }
    
    public void llenarArreglo() {
        Scanner entrada = new Scanner(System.in);
        String nombreCompleto;
        String id;
        for (int i=0;i<miArreglo.length;i++) {
            System.out.println("Ingrese el nombre completo del alumno:");
            nombreCompleto = entrada.next();
            System.out.println("Ingrese el ID del alumno:");
            id = entrada.next();
            miArreglo[i]= new Alumno(nombreCompleto,id);
            System.out.println("");
        }
    }
    
    public void presentarArreglo(){
        for (int i=0;i<miArreglo.length;i++) {
            System.out.printf("Nombre completo del alumno: %s\n"
                    + "ID del alumno: %s\n",miArreglo[i].nombreCompleto,
                    miArreglo[i].id);
        }
    }
    
    public int buscarAlumno(String _id) {
        for (int i=0;i<miArreglo.length;i++) {
            if (_id.equalsIgnoreCase(miArreglo[i].id)) {
                return i;
            }
        }
        return -1;
    }
    
    public void encontrarAlumno(String _id) {
        int i = buscarAlumno(_id);
        if (i!=-1) {
            System.out.printf("El alumno %s (%s) se encuentra registrado y está"
                    + " en la posición: %d\n",miArreglo[i].nombreCompleto,
                    miArreglo[i].id,i);
        } else {
            System.out.println("El alumno no se encuentra registrado\n");
        }
    }
}
