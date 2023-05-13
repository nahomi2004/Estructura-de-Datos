
package paqueteuno;
import java.util.Scanner;

public class Ejecutor {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int n, opc, ordenar, num, encontrado;
        
        System.out.println("Tamaño del arreglo");
        n = entrada.nextInt();
        
        MetodosArreglos arreglo = new MetodosArreglos(n);
        
        do {
            opc = arreglo.menu();
            switch (opc) {
                case 1 -> {
                    arreglo.llenarArreglo();
                }
                case 2 -> {
                    if (arreglo.ev!=0) {
                       System.out.println("Mayor a menor [1]");
                        System.out.println("Menor a mayor [2]\n");
                        ordenar = entrada.nextInt();
                        switch (ordenar) {
                            case 1 -> {
                                arreglo.presentarArreglo(arreglo.ordenarArregloMayor());
                            }
                            case 2 -> {
                                arreglo.presentarArreglo(arreglo.ordenarArregloMenor());
                            }
                            default -> {
                                System.out.println("Número inválido\n");
                            }
                        } 
                    } else {
                        System.out.println("El arreglo no tiene elementos"
                                + "válidos\n");
                    }
                    
                }
                case 3 -> {
                    if (arreglo.ev!=0) {
                        System.out.println("¿Qué número desea buscar?");
                        num = entrada.nextInt();
                        encontrado = arreglo.buscarNumero(num);
                        if (encontrado!=-1){
                            System.out.println("El número "+num+" se encuentra en"
                                    + " la posición "+encontrado+" :D\n");
                        } else {
                            System.out.println("Él número no existe en el "
                                    + "arreglo\n");
                        }
                    } else {
                        System.out.println("El arreglo no tiene elementos"
                                + "válidos\n");
                    }
                }
                case 4 -> {
                    System.out.println("¿Qué número desea eliminar?");
                    num = entrada.nextInt();
                    arreglo.eliminarNumero(num);
                }
                case 5 -> {
                    arreglo.presentarArreglo(arreglo.miArreglo);
                }
                default -> {
                    
                }
            }
        } while (opc!=0);
        
    }
    
}
