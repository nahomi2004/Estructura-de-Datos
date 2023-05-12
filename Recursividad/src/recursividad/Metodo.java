/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad;

/**
 *
 * @author D E L L
 */
public class Metodo {
    
    public int Factorial(int x){
        int fac;
        // Al fac no lo podemos inicializar porque el método toma de refecrencia
        // eso, además si la multiplicación es fac=fac*Factorial(x-1); nos va
        // a dar un problema, ya que este fac, al no estar inicializado toma 
        // el valor de 0 y se multiplica 0 por el numero que tenga el 
        // método en ese momento, si se inicializa el fac en uno, nos da el 
        // el mismo problema ya que no se guardan los valores en fac, porque fac
        // siempre vuelve a iniciailizarse en cada una de las llamadas al método
        if (x==0){
            return 1;
        } else {
            System.out.print(x+" ");
            fac = x*Factorial(x-1);
        }
        return fac;
    }
    
    public int Suma (int x){
        int suma;
        if (x==0){
            return 0
                    ;
        } else {
            System.out.print(x+" ");
            suma = x+Suma(x-1);
        }
        return suma;
    }
    
}
