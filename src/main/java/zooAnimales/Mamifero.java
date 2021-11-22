/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooAnimales;

import java.util.ArrayList;

/**
 *
 * @author camilo
 */
public class Mamifero extends Animal {
    private static ArrayList<Mamifero> listado = new ArrayList<Mamifero>();
    public static int caballos = 0;
    public static int leones = 0;
    private boolean pelaje;
    private int patas;

    public Mamifero() {
        listado.add(this);
    }

    public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
        super(nombre, edad, habitat, genero);
        this.pelaje = pelaje;
        this.patas = patas;
        listado.add(this);
    }

    public static ArrayList<Mamifero> getListado() {
        return listado;
    }

    public boolean isPelaje() {
        return pelaje;
    }

    public void setPelaje(boolean pelaje) {
        this.pelaje = pelaje;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }
    
    public static int cantidadMamiferos() {
        return listado.size();
    }
    
    public static Mamifero crearCaballo(String nombre, int edad, String genero) {
        Mamifero mamifero = new Mamifero(nombre, edad, "pradera", genero, true, 4);
        caballos++;
        return mamifero;
    }
    
    public static Mamifero crearLeon(String nombre, int edad, String genero) {
        Mamifero mamifero = new Mamifero(nombre, edad, "selva", genero, true, 4);
        leones++;
        return mamifero;
    }

}
