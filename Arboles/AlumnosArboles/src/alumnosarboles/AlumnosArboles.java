/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alumnosarboles;

/**
 *
 * @author SALA H
 */
public class AlumnosArboles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op, num;
        Metodos obj = new Metodos();
        do {
            op = obj.menu();
            switch (op) {
                case 1 -> {
                    obj.insertar();
                }
                case 2 -> {
                    obj.listar();
                }
                case 3 -> {
                    obj.crearArboles();
                }
                case 4 -> {
                    if (obj.arbolVacio(obj.raizMujeres)) {
                        System.err.println("Arbol vacio");
                        System.out.println("");
                    } else {
                        obj.inOrden(obj.raizMujeres);
                        System.out.println("              null");
                        System.out.println("");
                    }                    
                }
                case 5 -> {
                    if (obj.arbolVacio(obj.raizVarones)) {
                        System.err.println("Arbol vacio");
                        System.out.println("");
                    } else {
                        obj.inOrden(obj.raizVarones);
                        System.out.println("              null");
                        System.out.println("");
                    }                    
                }
                case 6 -> {
                    if (obj.arbolVacio(obj.raizMujeres)) {
                        System.err.println("Arbol vacio");
                        System.out.println("");
                    } else {
                        System.out.println("APROBADAS");
                        obj.reporteInOrdenAprobados(obj.raizMujeres);
                        System.out.println("              null");
                        System.out.println("");
                    }   
                }
                case 7 -> {
                    if (obj.arbolVacio(obj.raizMujeres)) {
                        System.err.println("Arbol vacio");
                        System.out.println("");
                    } else {
                        System.out.println("REPROBADAS");
                        obj.reporteInOrdenReprobados(obj.raizMujeres);
                        System.out.println("              null");
                        System.out.println("");
                    }  
                }
                case 8 -> {
                    if (obj.arbolVacio(obj.raizVarones)) {
                        System.err.println("Arbol vacio");
                        System.out.println("");
                    } else {
                        System.out.println("APROBADOS");
                        obj.reporteInOrdenAprobados(obj.raizVarones);
                        System.out.println("");
                        System.out.println("");
                    }  
                }
                case 9 -> {
                    if (obj.arbolVacio(obj.raizVarones)) {
                        System.err.println("Arbol vacio");
                        System.out.println("");
                    } else {
                        System.out.println("REPROBADOS");
                        obj.reporteInOrdenReprobados(obj.raizVarones);
                        System.out.println("              null");
                        System.out.println("");
                    }
                }
                default -> {
                        
                }
            }
        } while (op!=0);
    }    
}
    

