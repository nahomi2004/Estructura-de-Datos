/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colaspilas;

import java.util.Scanner;

/**
 *
 * @author SALA H
 */
public class ColasPilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int lim, op;
       System.out.println("Tamaño de la cola");
       lim = entrada.nextInt();
       //Metodos pilas = new Metodos(lim);
       MetodosColas colas = new MetodosColas(lim);
       /*do {
           op = pilas.menu();
           switch (op) {
               case 1 -> pilas.push();
               case 2 -> pilas.pop();
               default -> {}
           }
       } while (op!=0);*/

       do {
           op = colas.menu();
           switch (op) {
               case 1 -> colas.push();
               case 2 -> colas.pop();
               default -> {}
           }
       } while (op!=0);
   }
    
}
