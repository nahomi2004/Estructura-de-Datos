/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arbolesavl;

/**
 *
 * @author UTPL
 */
public class ArbolesAVL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MetodosAVL myArbol = new MetodosAVL();
        int op, num;

        do {
            op = myArbol.menu();
            switch (op) {
                case 1 -> {
                    System.out.print("Ingrese un numero: ");
                    num = myArbol.entrada.nextInt();
                    myArbol.raiz = myArbol.insertarAVL(num, myArbol.raiz);
                }
                case 2 -> {
                    //System.out.println("");
                    //System.out.println("PreOrden:");
                    //myArbol.preOrden(myArbol.raiz);
                    //System.out.println("");
                    //System.out.println("PosOrden:");
                    //myArbol.posOrden(myArbol.raiz);
                    System.out.println("");
                    System.out.println("InOrden:");
                    myArbol.inOrden(myArbol.raiz);
                    System.out.print("uwu");
                    System.out.println("");
                }
                /*case 3 -> {
                    System.out.print("Ingrese un numero: ");
                    num = myArbol.entrada.nextInt();
                    myArbol.eliminar(num, myArbol.raiz);
                }*/
                default -> {

                }
            }
        } while (op != 0);
    }

}
