/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion;
import java.util.ArrayList;

import zooAnimales.Animal;
/**
 *
 * @author camilo
 */
public class Zona {
    private String nombre;
    private Zoologico zoo;
    private static ArrayList<Animal> animales = new ArrayList<Animal>();

    public Zona() {
    }

    public Zona(String nombre, Zoologico zoo) {
        this.nombre = nombre;
        this.zoo = zoo;
        this.zoo.agregarZonas(this);
    }
    
    public void agregarAnimales(Animal animal) {
        animales.add(animal);
    }
    
    public int cantidadAnimales() {
        return animales.size();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Zoologico getZoo() {
        return zoo;
    }

    public void setZoo(Zoologico zoo) {
        this.zoo = zoo;
    }
    
    public static ArrayList<Animal> getAnimales() {
        return animales;
    }

    public static void setAnimales(ArrayList<Animal> animales) {
        Zona.animales = animales;
    }
}
