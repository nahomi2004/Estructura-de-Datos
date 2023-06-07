/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listas;

/**
 *
 * @author SALA H
 */
public class Listas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op;
        Metodos mylista=new Metodos();
        
        do{
            op=mylista.menu();
            switch (op){
                case 1 -> mylista.insertar();
                case 2 -> mylista.recorrer();   
                case 3 -> mylista.insInicio();
                case 4 -> mylista.insOrdenado();
                case 5 -> mylista.eliminar();
                default -> {
                    System.out.println("Adiós"); 
                    op=0;
                }
            }
            
        }while (op!=0);
    }
    
}
