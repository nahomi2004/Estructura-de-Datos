/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enlazadascolas;

/**
 *
 * @author SALA H
 */
public class EnlazadasColas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op;
        MetodosColas myCola = new MetodosColas();
        do {
            op = myCola.menu();
            switch (op) {
                case 1 -> {
                    myCola.push();
                }
                case 2 -> {
                    myCola.pop();
                    myCola.presentar();
                }
                case 3 -> {
                    myCola.presentar();
                }
                default -> {
                        
                }
            }
        } while (op!=0);
    }
    
}
