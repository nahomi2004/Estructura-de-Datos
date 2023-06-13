/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alumnoo;

/**
 *
 * @author UTPL
 */
public class Persona {
    int id;
    String nombre;
    char sexo;

    public Persona(int i, String n, char s) {
        id = i;
        nombre = n;
        sexo = s;
    }

    public int getId() {
        return id;
    }

    public void setId(int i) {
        id = i;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String i) {
        nombre = i;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char i) {
        sexo = i;
    }
}
