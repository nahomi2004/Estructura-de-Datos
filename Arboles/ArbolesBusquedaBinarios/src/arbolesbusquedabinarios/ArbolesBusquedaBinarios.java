/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arbolesbusquedabinarios;

/**
 *
 * @author SALA H
 */
public class ArbolesBusquedaBinarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op;
        MetodosABB myArbol = new MetodosABB();
        do {
            op = myArbol.menu();
            switch (op) {
                case 1 -> {
                    myArbol.insertar();
                }
                case 2 -> {
                    myArbol.preOrden();
                    myArbol.posOrden();
                    myArbol.inOrden();
                }
                default -> {
                        
                }
            }
        } while (op!=0);
    }
    
}
