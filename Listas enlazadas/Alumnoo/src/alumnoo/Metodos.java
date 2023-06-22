/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alumnoo;

import java.util.Scanner;

/**
 *
 * @author Nahomi Cabrera
 */

public class Metodos {
    private AlumnoNodo head;
    Scanner entrada;
    
    public Metodos(){
        this.head=null;
        this.entrada=new Scanner(System.in);
    }
    
    public int menu (){
        System.out.println("");
        System.out.println("          MENU");
        System.out.println("Insertar            [1]: ");
        System.out.println("Eliminar            [2]: ");
        System.out.println("Reporte varones     [3]: ");
        System.out.println("Reporte damas       [4]: ");
        System.out.println("Listar              [5]: ");
        System.out.println("Salir               [0]: ");
        return entrada.nextInt();         
    }
    
    // Este método permite saber si la lista está vacía.
    public boolean listaVacia(){
        return (head==null);
    }
    
    // Esta función permite leer los datos para crear y retornar un nuevo objeto
    // de tipo alumno, las funciones más importantes que realiza es controlar
    // si el género se asinga correctamente y comprobar si el ID ingresado
    // es correcto o no (si no se repite o si sí).
    public AlumnoNodo leerDatos(){
        double [] calif = new double [3];
        AlumnoNodo nuevo=null;
                
        System.out.print("\nIngrese nombre del estudiante: ");
        String nombre = entrada.next();
        entrada.nextLine();
        System.out.print("Ingrese id del estudiante: ");
        int id = entrada.nextInt();
        AlumnoNodo aux = comprobrarID(id);
        if (aux!=null) {
            System.err.println("No se pudo crear al estudiante...");
            System.out.println("");
            System.out.printf("Este ID ya está ingresado, el estudiante "
                    + "perteneciente al él es:\nNombre: [%s]\nID: [%d]\nSexo: [%s]\n",
                    aux.nombre, aux.id, aux.sexo);
            return nuevo;
        } else {
            entrada.nextLine();
            System.out.println("Ingrese [m] si es mujer o [v] si es varon");
            char sexo = entrada.nextLine().charAt(0);

            if (sexo=='m' || sexo=='v') {
                System.out.println("Ingrese las calificaciones");
                for (int i=0;i<calif.length;i++) {
                    System.out.print("Calificacion ["+(i+1)+"]: ");
                    calif[i] = entrada.nextDouble();
                }
                
                nuevo = new AlumnoNodo(id,nombre,sexo,calif);
            } else {
                System.err.println("Ingrese 'v' o 'm', por favor. Inténtelo de nuevo");
            }
        }        
        return nuevo;
    }
    
    // Este método lo que realiza es comprobar y guardar el valor que devuelve la función
    // leerDatos(). Si el valor es null entonces no se insertará el objeto en 
    // la lista, si es diferente de null, entonces nuevo será insertado, de
    // forma que los ID de los estudiantes estén ordenados ascendentemente.
    public void insertar(){
        AlumnoNodo nuevo = leerDatos();
        if (nuevo==null) {
            System.out.println("");
            System.err.println("No se puede ingresar al alumno D:");
            System.out.println("");
        } else {
            if (listaVacia()) {
            head = nuevo;
            } else {
                if (nuevo.id<head.id) {
                    nuevo.sig = head;
                    head = nuevo;
                } else {
                    AlumnoNodo actual = head;

                    while (actual.sig!=null && nuevo.id>actual.sig.id) 
                        actual = actual.sig;

                    nuevo.sig = actual.sig;
                    actual.sig = nuevo;              
                }
            }
            System.out.println("El estudiante se ha agregado correctamente");
        }
    }

    // En este método lo que se realiza es mostrar los elementos de la lista.
    // Primero se controla el hecho de si la lista está vacía,
    // en caso de que si esté vacía se muestra un mensaje de error, si no es el caso
    // se procede a mostar el/los elemento/s que hay en ella.
    public void listar(){
        if (listaVacia()) {
            System.out.println("");
            System.err.println("No existen elementos");
        } else {
            AlumnoNodo actual = head;
            while (actual!=null) {
                System.out.printf("\nID: %d\nNombre: %s\nSexo: %s\n",
                        actual.id,actual.nombre,actual.sexo);
                System.out.println("Calificaciones:");
                for (int i=0;i<actual.getCalif().length;i++) {
                    System.out.printf("Calificacion [%d]: %.2f\n", i+1 , actual.getCalif()[i]);
                }
                System.out.println("Promedio: "+actual.Promedio());
                actual=actual.sig;
            }
        }
    }
    
    // Este método reliza la función de mostrar un reporte de estudiantes
    // aprobados y reprobados dependiendo de su sexo. Sobra decirlo, pero
    // primero verifica si la lista tiene algún elemento o si la lista tiene
    // alumnos del género que se desea presentar, y dependiendo de eso se
    // mostrará o un mensaje de error o a el/los estudiante/s del género
    // que se deasea.
    public void reporteAprobadoSegunSexo (char x) {
        AlumnoNodo actual = head;        
        if (listaVacia() || listaVaciaGenero(x)!=1) {
            System.out.println("");
            System.err.println("Lista Vacia...");
        } else {
            while(actual!=null) {
                if (actual.sexo==x) {
                    if (actual.Promedio()>=7) {
                        System.out.printf("\nID: %d\nNombre: %s\nSexo: %s\n",
                            actual.id,actual.nombre,actual.sexo);
                        System.out.println("APROBADO");
                    } else {
                        System.out.printf("\nID: %d\nNombre: %s\nSexo: %s\n",
                            actual.id,actual.nombre,actual.sexo);
                        System.err.println("REPROBADO");
                    }
                }
                actual=actual.sig;
            }
        }
    }
    
    // Lo que pretende hacer este método es eliminar a un estudiante de la
    // lista. Lo primero que hace es comprobar si hay elementos en la lista,
    // Si no hay, muestra un mensaje de error, y si hay procede a 
    // buscarlo por el ID, si lo encuentra los enlaces se moverán eliminando
    // al objeto, sino, se mostrará un mensaje de error diciendo que no existe
    // ese estudiante.
    public void eliminar() {
        System.out.println("Ingrese id del estudiante:");
        int id = entrada.nextInt();
        
        if (listaVacia()) {
            System.out.println("");
            System.err.println("Lista Vacia...");
        } else {
            if (id == head.id) {
                head = head.sig;
                System.out.println("Eliminado correctamente");
            } else {
                AlumnoNodo actual = head;
                while (actual.sig!=null && actual.sig.id!=id)
                    actual = actual.sig;
                
                if (actual.sig!=null) {
                    System.out.println("Eliminado correctamente");
                    actual.sig = actual.sig.sig;                    
                } else {
                    System.err.println("No existe");               
                }
            }
        }
    }
    
    // Lo que realiza esta función es comprobrar si el ID ya existe o no.
    // Si ya existe se retorna al objeto que tiene este ID, sino, se retorna
    // un valor null.
    public AlumnoNodo comprobrarID (int i) {
        AlumnoNodo aux=null;
        if (listaVacia()) {
            return aux;
        } else {
            AlumnoNodo actual = head;
            while (actual!=null) {
                if (i==actual.id) {
                    String nombre = actual.nombre;
                    int id = actual.id;
                    char sexo = actual.sexo;
                    aux = new AlumnoNodo(id, nombre, sexo);
                }
                actual = actual.sig;
            }
        }
        return aux;
    }
    
    // Esta función sirve para comprobar si la lista está llena o vacía respecto
    // al género de los estudiantes.
    public int listaVaciaGenero(char s) {
        int num = -1;
        if (listaVacia()) {
            return num;
        } else {
            AlumnoNodo actual = head;
            while (actual!=null) {
                if (s==actual.sexo) {
                    num = 1;
                }
                actual = actual.sig;
            }
        }
        return num;
    }
}
