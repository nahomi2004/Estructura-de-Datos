/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author SALA H
 */
public class Metodos {

    Nodo head;
    Scanner entrada;
    int cont;

    public Metodos() {
        this.head = null;
        this.entrada = new Scanner(System.in);
        this.cont = 0;
    }

    public int menu() {
        System.out.println("\nInsertar            [1]: ");
        System.out.println("Recorrer            [2]: ");
        System.out.println("Elimina             [3]: ");
        System.out.println("Salir               [0]:");
        return entrada.nextInt();
    }

    public boolean listaVacia() {
        return (head == null);
    }

    public void insertar() {
        int num;
        System.out.print("Ingrese dato: ");
        num = entrada.nextInt();
        Nodo nuevo = new Nodo(num);
        if (listaVacia()) {
            head = nuevo;
        } else {
            Nodo actual = head;

            while (actual.sig != null) {
                actual = actual.sig;
            }
            actual.sig = nuevo;
            cont++;
        }
    }

    public void recorrer() {
        Nodo actual = head;
        if (listaVacia()) {
            System.err.println("Lista vacía");
        } else {
            while (actual != null) {
                System.out.print(actual.dato + " -> ");
                actual = actual.sig;
            }
        }
    }

    public void eliminar() {
        Nodo actual = head;
        Nodo previo = null;

        while (actual != null) {
            int datoActual = actual.dato;
            Nodo siguiente = actual.sig;
            boolean repetido = false;

            while (siguiente != null && siguiente.dato == datoActual) {
                repetido = true;
                siguiente = siguiente.sig;
            }

            if (repetido) {
                if (previo == null) {
                    // Si el nodo repetido es la cabeza de la lista
                    head = siguiente;
                } else {
                    // Si el nodo repetido no es la cabeza de la lista
                    previo.sig = siguiente;
                }
            } else {
                previo = actual;
            }

            actual = siguiente;
        }
    }

    /*
    public void eliminar() {
        Nodo actual = head;

        while (actual != null) {
            int datoRepetido = -1;
            Nodo siguiente = actual.sig;

            while (siguiente != null) {
                if (siguiente.dato == actual.dato) {
                    datoRepetido = siguiente.dato;
                    actual.sig = siguiente.sig;
                }
                siguiente = siguiente.sig;
            }

            actual = actual.sig;

            // Eliminar todos los nodos con el valor datoRepetido
            Nodo previo = null;
            Nodo temp = head;

            while (temp != null) {
                if (temp.dato == datoRepetido) {
                    if (previo == null) {
                        head = temp.sig;
                        temp = head;
                    } else {
                        previo.sig = temp.sig;
                        temp = temp.sig;
                    }
                } else {
                    previo = temp;
                    temp = temp.sig;
                }
            }
        }
     */
 /*
    Nodo actual = head;
        Nodo previo = null;

        while (actual != null) {
            Nodo siguiente = actual.sig;
            Nodo compa = null;
            Nodo anterior = null;
            boolean repetido = false;

            while (siguiente != null && siguiente.dato == actual.dato) {
                repetido = true;
                if (compa == null) {
                    compa = siguiente;
                } else {
                    anterior = compa;
                    compa = siguiente;
                }
                siguiente = siguiente.sig;
            }

            if (repetido) {
                if (previo == null) {
                    head = siguiente;
                } else {
                    previo.sig = siguiente;
                }

                if (anterior != null) {
                    anterior.sig = siguiente;
                }
            } else {
                previo = actual;
            }

            actual = siguiente;
        }
    
    Nodo actual = head;
        Nodo previo = null;

        while (actual != null) {
            Nodo siguiente = actual.sig;
            Nodo compa = null;
            boolean repetido = false;

            while (siguiente != null && siguiente.dato != actual.dato) {
                compa = siguiente;
                siguiente = siguiente.sig;
            }
            
            if (siguiente != null && siguiente.dato == actual.dato) {
            repetido = true;
                if (previo == null)
                    head = actual.sig;
                else {
                    previo.sig = actual.sig;
                    compa.sig = siguiente.sig;
                }
            }
            
            
            previo = actual;
            actual = siguiente;
        }
    
    Nodo siguiente = actual.sig;
            boolean repetido = false;

            while (siguiente != null && siguiente.dato == actual.dato) {
                repetido = true;
                siguiente = siguiente.sig;
            }

            if (repetido) {
                if (previo == null) {
                    head = siguiente;
                } else {
                    previo.sig = siguiente;
                }
            } else {
                previo = actual;
            }

            actual = siguiente;
     */
 /*public double promedio() {
        double promedio=0;
        Nodo actual = head;
        while (actual != null) {
            promedio+=actual.dato;
            actual = actual.sig;
        }
        return promedio/cont;
    }*/

 /*public void insInicio() {
        int num;
        System.out.print("Ingrese dato: ");
        num = entrada.nextInt();
        Nodo nuevo = new Nodo(num);
        if (listaVacia()) {
            head = nuevo;
            tail = nuevo;
        } else {
            nuevo.sig = head;
            head = nuevo;
        }
    }*/

 /*public void insOrdenado() {
        int num;
        System.out.print("Ingrese dato: ");
        num = entrada.nextInt();
        Nodo nuevo = new Nodo(num);
        if (listaVacia()) {
            head = nuevo;
            tail = nuevo;
        } else {
            if (num < head.dato) {
                nuevo.sig = head;
                head = nuevo;
            } else {
                Nodo actual = head;
                while (actual.sig != null && num > actual.sig.dato) {
                    actual = actual.sig;
                    nuevo.sig = actual.sig;
                    actual.sig = nuevo;
                    if (nuevo.sig == null) {
                        tail = nuevo;
                    }
                }
            }
        }
    }*/

 /*public void eliminar() {
        int num;
        System.out.print("Ingrese dato: ");
        num = entrada.nextInt();
        Nodo nuevo = new Nodo(num);
        if (listaVacia()) {
            head = nuevo;
            tail = nuevo;
        } else {
            if (num == head.dato) {
                if (head.sig == null) {
                    tail = null;
                }
                head = head.sig;
            } else {
                Nodo actual = head;
                while (actual.sig != null && actual.sig.dato != num) {
                    actual = actual.sig;
                }
                if (actual.sig == tail) {
                    tail = actual;
                }
                if (actual.sig != null) {
                    actual.sig = actual.sig.sig;
                } else {
                    System.out.println("No está :(");
                }

            }
        }
    }*/
}
