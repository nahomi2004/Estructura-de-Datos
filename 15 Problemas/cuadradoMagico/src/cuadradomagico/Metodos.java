/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuadradomagico;

public class Metodos {
    
    public int[][] crearCuadradoMagico(int _n) {
        
        int [][] matriz = new int [_n][_n];
        // Posicionar el primer número en la posición superior central
        int fila = 0;
        int columna = matriz.length / 2;
        matriz[fila][columna] = 1;

        // Llenar el cuadrado mágico con los números restantes
        for (int num=2; num<= _n*_n;num++) {
            fila--;
            columna++;

            // Verificar si la posición está fuera del rango y corregirla
            if (fila < 0) {
                fila = _n - 1;
            }
            if (columna == _n) {
                columna = 0;
            }

            // Verificar si la posición ya está ocupada y corregirla
            while (matriz[fila][columna] != 0) {
                fila++;
                if (fila == _n) {
                    fila = 0;
                }
            }

            matriz[fila][columna] = num;
        }

        return matriz;
    }

    public void mostrarCuadradoMagico(int _n) {
        int [][] matriz = crearCuadradoMagico(_n);
        for (int[] fila : matriz) {
            for (int num : fila) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }
}
