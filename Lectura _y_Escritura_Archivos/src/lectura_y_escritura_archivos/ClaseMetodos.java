
package lectura_y_escritura_archivos;

/*  Elabore un programa que permita escribir y leer registros
    a y desde un archivo. */

import java.util.Scanner;

import java.io.*;
/*  Estamos llamando a la librería que me permite
    llamar a los archivos tipos File, etc. */

public class ClaseMetodos {
    Scanner entrada;
    
    File archivo = new File ("miArchivo.txt");
    /*  Creamos la ruta en la que se va a guardar el archivo
        esta se llama ruta relativa y el archivo se guarda en el paquete
        donde estamos trabajando. */
    
    public ClaseMetodos(){
        this.entrada=new Scanner(System.in);
        /*  Este es el constructor que nos ayudará a leer todo lo que ingrese
            el usuario por teclado. */
    }

    public int menu (){
        System.out.println("Escribir desde archivo creado: [1]");
        System.out.println("Leer desde archivo: [2]");
        System.out.println("Sobrescribir archivo: [3]");
        System.out.println("Eliminar archivo: [4]");
        System.out.println("Salir: [0]");
        return entrada.nextInt();
    }

    public void ingresar(){
        FileWriter escribir;
        PrintWriter linea;
        String _nombre="", _correo="", _direccion="";

        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
            } catch (Exception e) {
                
            }
        }

        try {
            entrada.nextLine();
            System.out.print("\nDigite el nombre: ");
            _nombre=entrada.nextLine();
            System.out.print("Digite el correo: ");
            _correo=entrada.nextLine();
            System.out.print("Digite la direccion: ");
            _direccion=entrada.nextLine();
            
            escribir = new FileWriter(archivo, true);
            
            linea = new PrintWriter (escribir);
            
            linea.println(_nombre+"\n"+_correo+"\n"+_direccion);
            
            linea.close();       	 
        } catch (Exception e) {  
            
        }
    }

    public void presentar(){
        FileReader leer;
        BufferedReader almacenamiento;
        String cadena="", _nombre="", _correo="", _direccion="";

        try {
            leer = new FileReader(archivo);
            almacenamiento = new BufferedReader(leer);
        
            while (cadena !=null){
                try {
                    cadena=almacenamiento.readLine();
                    _nombre = cadena;
                    cadena=almacenamiento.readLine();
                    _correo = cadena;
                    cadena=almacenamiento.readLine();
                    _direccion = cadena;

                    if (cadena !=null){
                        System.out.println("\nNombre: "+_nombre+"\nCorreo: "
                                +_correo+"\nDireccion: "+_direccion+"\n");
                    }
                }catch (Exception e) {

                }      	 
            }
            almacenamiento.close();
            leer.close();
        }catch (Exception e) {
            
        }
    }
    
    public void escribirDesdeCero(){
        FileWriter escribir;
        PrintWriter linea;
        String _nombre="", _correo="", _direccion="";

        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
            } catch (Exception e) {
                
            }
        }

        try {           
            entrada.nextLine();
            System.out.print("Digite el nombre: ");
            _nombre=entrada.nextLine();
            System.out.print("Digite el correo: ");
            _correo=entrada.nextLine();
            System.out.print("Digite la direccion: ");
            _direccion=entrada.nextLine();
            
            escribir = new FileWriter(archivo, false);
            
            linea = new PrintWriter (escribir);
            
            linea.println(_nombre+"\n"+_correo+"\n"+_direccion);
            
            linea.close();       	 
        } catch (Exception e) {  
            
        }
    }
    
    public void eliminarArchivo (){
        if (archivo.delete())
            System.out.println("El archivo ha sido borrado :D");
        else
            System.out.println("El fichero no puede ser borrado :(");
    }

}


