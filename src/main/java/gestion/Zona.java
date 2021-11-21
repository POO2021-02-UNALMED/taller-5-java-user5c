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
    private ArrayList<Animal> animales;

    public Zona() {
    }

    public Zona(String nombre, Zoologico zoo, ArrayList<Animal> animales) {
        this.nombre = nombre;
        this.zoo = zoo;
        this.animales = animales;
    }
    
    public void agregarAnimales(Animal animal) {
        this.animales.add(animal);
    }
    
    public int cantidadAnimales() {
        return this.animales.size();
    }

    public Zoologico getZoo() {
        return zoo;
    }

    public void setZoo(Zoologico zoo) {
        this.zoo = zoo;
    }
}
