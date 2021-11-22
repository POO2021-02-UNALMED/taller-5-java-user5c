/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooAnimales;

import java.util.ArrayList;

/**
 *
 * @author camilo
 */
public class Ave extends Animal {
    private static ArrayList<Ave> listado = new ArrayList<Ave>();
    public static int halcones = 0;
    public static int aguilas = 0;
    private String colorPlumas;

    public Ave() {
        super();
        listado.add(this);
    }

    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
        super(nombre, edad, habitat, genero);
        this.colorPlumas = colorPlumas;
        listado.add(this);
    }

    public static ArrayList<Ave> getListado() {
        return listado;
    }

    public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }
    
    public int cantidadAves() {
        return listado.size();
    }
    
    @Override
    public String movimiento() {
        return "volar";
    }
    
    public static Ave crearHalcon(String nombre, int edad, String genero) {
        halcones++;
        Ave ave = new Ave(nombre, edad, "montanas" ,genero, "cafe glorioso");
        return ave;
    }
    
    public static Ave crearAguila(String nombre, int edad, String genero) {
        aguilas++;
        Ave ave = new Ave(nombre, edad, "montanas" ,genero, "blanco y amarillo");
        return ave;
    }
    
}
