/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enlazadasPilas;
/**
 *
 * @author SALA H
 */
public class EnlazadasPilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op;
        MetodosPilas myPila = new MetodosPilas();
        do {
            op = myPila.menu();
            switch (op) {
                case 1 -> {
                    myPila.push();
                }
                case 2 -> {
                    myPila.pop();
                    myPila.presentar();
                }
                case 3 -> {
                    myPila.presentar();
                }
                default -> {
                        
                }
            }
        } while (op!=0);
   }
    
}
