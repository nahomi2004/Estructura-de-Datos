/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrizaleatoria;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author D E L L
 */
public class Metodos {
    // Generar una matriz de N×N con números aleatorios sin repetirse.
    
    int [][] matriz;
    ArrayList<Integer> aux = new ArrayList<>();
    Random random;
    int rango = 100;
    
    public Metodos (int _n) {
        matriz = new int [_n][_n];
        random = new Random();
    }
    
    public void llenarMatriz () {
        
        while (aux.size() < matriz.length*matriz[0].length) {
            int numAle = random.nextInt(rango)+1;
            if (!aux.contains(numAle)) {
                aux.add(numAle);
            }
        }
        
        int cont = 0;
        for (int i=0;i<matriz.length;i++) {
            for (int j=0;j<matriz[0].length;j++) {
                matriz [i][j] = aux.get(cont);
                cont++;
            }
        }
    }
    
    public void presentarMatriz () {
        for (int i=0;i<matriz.length;i++) {
            for (int j=0;j<matriz[i].length;j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }
}
