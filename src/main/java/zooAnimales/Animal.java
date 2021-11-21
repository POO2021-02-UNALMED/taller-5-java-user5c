/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooAnimales;

import gestion.Zona;

/**
 *
 * @author camilo
 */
public class Animal {
    private int totalAnimales;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private Zona zona;

    public Animal() {
        totalAnimales++;
    }

    public Animal(String nombre, int edad, String habitat, String genero, Zona zona) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        this.zona = zona;
        totalAnimales++;
    }
    
    public String movimiento() {
        return "desplazarse";
    }
    
    public String totalPorTipo() {
        int totalMamiferos = 0;
        int totalAves = 0;
        int totalReptiles = 0;
        int totalPeces = 0;
        int totalAnfibios = 0;
        
        // TODO: Contar total de cada tipo de animal
        
        String porTipo = ""
                + "Mamiferos: " + totalMamiferos
                + "Aves: " + totalAves
                + "Reptiles: " + totalReptiles
                + "Peces: " + totalPeces
                + "Anfibios: " + totalAnfibios;
        
        return porTipo;
    }
    
    @Override
    public String toString() {
        String string =  ""
            + "Mi nombre es"+nombre+", tengo una edad de "+edad+", "
            + "habito en "+habitat+" y mi genero es "+genero;
        
        if(zona != null) {
            string += ", la zona en la que me ubico es "+zona.toString()+", en el "+zona.getZoo().toString();
        }
        
        return string;
    }
    
}