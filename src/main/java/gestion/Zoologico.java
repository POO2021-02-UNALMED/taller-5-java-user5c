/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion;

import java.util.ArrayList;

/**
 *
 * @author camilo
 */
public class Zoologico {
    private String nombre;
    private String ubicacion;
    private ArrayList<Zona> zonas;

    public Zoologico() {

    }
    
    public Zoologico(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }
    
    public int cantidadTotalAnimales() {
        int totalAnimales = 0;
        for(Zona zona: this.zonas){
            totalAnimales += zona.cantidadAnimales();
        }
        return totalAnimales;
    }
    
    public void agregarZonas(Zona zona){
        this.zonas.add(zona);
    }
}
