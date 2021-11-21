/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooAnimales;

import gestion.Zona;
import java.util.ArrayList;

/**
 *
 * @author camilo
 */
public class Mamifero extends Animal {
    private static ArrayList<Mamifero> listado;
    public static int caballos;
    public static int leones;
    private boolean pelaje;
    private int patas;

    public Mamifero() {
        listado.add(this);
    }

    public Mamifero(String nombre, int edad, String habitat, String genero, Zona zona, boolean pelaje, int patas) {
        super(nombre, edad, habitat, genero, zona);
        this.pelaje = pelaje;
        this.patas = patas;
        listado.add(this);
    }
    
    public int cantidadMamiferos() {
        return listado.size();
    }
    
    public static Mamifero crearCaballo(String nombre, int edad, String genero, Zona zona) {
        caballos++;
        return new Mamifero(nombre, edad, "pradera", genero, zona, true, 4);
    }
    
    public static Mamifero crearLeon(String nombre, int edad, String genero, Zona zona) {
        leones++;
        return new Mamifero(nombre, edad, "selva", genero, zona, true, 4);
    }

}
