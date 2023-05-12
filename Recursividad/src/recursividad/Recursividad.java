/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividad;

import java.util.Scanner;

/**
 *
 * @author D E L L
 */
public class Recursividad {
    public static void main(String[] args) {
        Metodo metodo = new Metodo();
        Scanner entrada = new Scanner(System.in);
        
        int num,fac,suma;
        System.out.println("Ingrese un número");
        num = entrada.nextInt();
        fac = metodo.Factorial(num);
        System.out.println(fac);
        suma = metodo.Suma(num);
        System.out.println(suma);
    }
    
}
