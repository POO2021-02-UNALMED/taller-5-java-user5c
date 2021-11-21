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
public class Ave extends Animal {
    private static ArrayList<Ave> listado;
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;

    public Ave() {
        listado.add(this);
    }

    public Ave(String nombre, int edad, String habitat, String genero, Zona zona, String colorPlumas) {
        super(nombre, edad, habitat, genero, zona);
        this.colorPlumas = colorPlumas;
        listado.add(this);
    }
    
    public int cantidadAves() {
        return listado.size();
    }
    
    @Override
    public String movimiento() {
        return "volar";
    }
    
    public static Ave crearHalcon(String nombre, int edad, String genero, Zona zona) {
        halcones++;
        return new Ave(nombre, edad, "montanas" ,genero, zona, "cafe glorioso");
    }
    
    public static Ave crearAguila(String nombre, int edad, String genero, Zona zona) {
        aguilas++;
        return new Ave(nombre, edad, "montanas" ,genero, zona, "blanco y amarillo");
    }
    
}
