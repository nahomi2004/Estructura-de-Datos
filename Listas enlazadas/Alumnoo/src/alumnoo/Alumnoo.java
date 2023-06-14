/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alumnoo;

/**
 *
 * @author UTPL
 */
public class Alumnoo {

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
                case 2 -> mylista.eliminar();
                case 3 -> mylista.reporteAprobadoSegunSexo('v');
                case 4 -> mylista.reporteAprobadoSegunSexo('m');
                case 5 -> mylista.listar();
                default -> {
                    System.out.println("Adiós"); 
                    op=0;
                }
            }
            
        }while (op!=0);
    }
    
}
