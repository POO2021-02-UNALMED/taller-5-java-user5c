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
    public int halcones;
    public int aguilas;
    private String colorPlumas;

    public Ave() {
        listado.add(this);
    }

    public Ave(String nombre, int edad, String habitat, String genero, Zona zona, int halcones, int aguilas, String colorPlumas) {
        super(nombre, edad, habitat, genero, zona);
        this.halcones = halcones;
        this.aguilas = aguilas;
        this.colorPlumas = colorPlumas;
        listado.add(this);
    }

    @Override
    public String movimiento() {
        return "volar";
    }
    
}
