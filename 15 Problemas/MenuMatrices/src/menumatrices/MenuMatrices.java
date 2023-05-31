/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menumatrices;

/**
 *
 * @author D E L L
 */
public class MenuMatrices {

    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        int opc;
        do{
            opc=metodos.menu();
            switch (opc) {
                case 1 ->  {
                    metodos.sumaMatrices();
                }
                case 2 ->  {
                    metodos.restaMatrices();
                }
                case 3 ->  {
                    metodos.multiplicaEscalar();
                }
                case 4 ->  {
                    metodos.transpuestaMatrices();
                }
                default -> {
                }
            }            
        } while (opc!=0);
    }
    
}
