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
    private static ArrayList<Zona> zonas = new ArrayList<Zona>();

    public Zoologico() {

    }
    
    public Zoologico(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public ArrayList<Zona> getZona() {
        return zonas;
    }

    public void setZona(ArrayList<Zona> zonas) {
        Zoologico.zonas = zonas;
    }
    
    public int cantidadTotalAnimales() {
        int totalAnimales = Zona.cantidadAnimales();
        return totalAnimales;
    }
    
    public void agregarZonas(Zona zona){
        Zoologico.zonas.add(zona);
    }
}
