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
public class Zoologico {
    private String nombre;
    private String ubicacion;
    private ArrayList<Zona> zonas = new ArrayList<>();

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
        this.zonas = zonas;
    }
    
    public int cantidadTotalAnimales() {
        int cant = 0;
        for(Zona zona: zonas){
            cant += zona.cantidadAnimales();
        }
        return cant;
    }
    
    public void agregarZonas(Zona zona){
        this.zonas.add(zona);
    }
}
