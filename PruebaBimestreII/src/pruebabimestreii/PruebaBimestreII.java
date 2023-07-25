/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebabimestreii;

/**
 *
 * @author D E L L
 */
public class PruebaBimestreII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op, num;
        Metodos myArbol = new Metodos();
        do {
            op = myArbol.menu();
            switch (op) {
                case 1 -> {
                    Cliente c = myArbol.ingresarCliente();
                    
                    if (c.getCategoria().equals("A")) {
                        myArbol.insertar(c, myArbol.raizA);
                        
                    } else if (c.getCategoria().equals("B")) {
                        myArbol.insertar(c, myArbol.raizB);
                        
                    } else if (c.getCategoria().equals("C")) {
                        myArbol.insertar(c, myArbol.raizC);
                    }
                }
                case 2 -> {
                    System.out.println("A qué categoría de clientes desea mostrar?");
                    char categoria = myArbol.entrada.next().charAt(0);
                    
                    if (categoria == 'A') {
                        
                        if (myArbol.raizA==null)
                            System.err.println("No hay nada que presentar");
                        else 
                            myArbol.inOrden(myArbol.raizA);
                        
                    } else if (categoria == 'B') {
                        
                        if (myArbol.raizA==null)
                            System.err.println("No hay nada que presentar");
                        else 
                            myArbol.inOrden(myArbol.raizB);
                        
                    } else if (categoria == 'C') {
                        
                        if (myArbol.raizA==null)
                            System.err.println("No hay nada que presentar");
                        else 
                            myArbol.inOrden(myArbol.raizC);
                    }
                }
            }
        } while (op != 0);
    }

}
