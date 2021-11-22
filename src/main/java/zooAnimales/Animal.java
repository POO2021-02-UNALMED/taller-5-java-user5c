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
public class Animal {
    private static int totalAnimales = 0;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private Zona zona;

    public Animal() {
        totalAnimales++;
    }

    public Animal(String nombre, int edad, String habitat, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        totalAnimales++;
    }

    public int getTotalAnimales() {
        return totalAnimales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }
    
    public String movimiento() {
        return "desplazarse";
    }
    
    public static String totalPorTipo() {
        int totalMamiferos = Mamifero.cantidadMamiferos();
        int totalAves = Ave.cantidadAves();
        int totalReptiles = Reptil.cantidadReptiles();
        int totalPeces = Pez.cantidadPeces();
        int totalAnfibios = Anfibio.cantidadAnfibios();
        
        String porTipo = "Mamiferos: " + totalMamiferos + "\n"
                + "Aves: " + totalAves + "\n"
                + "Reptiles: " + totalReptiles + "\n"
                + "Peces: " + totalPeces + "\n"
                + "Anfibios: " + totalAnfibios;

        return porTipo;
    }
    
    @Override
    public String toString() {
        String string =  ""
            + "Mi nombre es "+nombre+", tengo una edad de "+edad+", "
            + "habito en "+habitat+" y mi genero es "+genero;
        
        if(zona != null) {
            string += ", la zona en la que me ubico es "+zona.toString()+", en el "+zona.getZoo().toString();
        }
        
        return string;
    }
    
}
