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
    private ArrayList<Mamifero> listado;
    public int caballos;
    public int leones;
    private boolean pelaje;
    private int patas;

    public Mamifero() {
        listado.add(this);
    }

    public Mamifero(String nombre, int edad, String habitat, String genero, Zona zona, int caballos, int leones, boolean pelaje, int patas) {
        super(nombre, edad, habitat, genero, zona);
        this.caballos = caballos;
        this.leones = leones;
        this.pelaje = pelaje;
        this.patas = patas;
        listado.add(this);
    }


}
