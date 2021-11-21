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
public class Anfibio extends Animal {
    private static ArrayList<Anfibio> listado;
    public static int ranas;
    public static int salamandras;
    private String colorPiel;
    private boolean venenoso;

    public Anfibio() {
        listado.add(this);
    }

    public Anfibio(String nombre, int edad, String habitat, String genero, Zona zona, String colorPiel, boolean venenoso) {
        super(nombre, edad, habitat, genero, zona);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        listado.add(this);
    }
    
    public int cantidadAnfibios() {
        return listado.size();
    }

    @Override
    public String movimiento() {
        return "saltar";
    }
    
    public static Anfibio crearRana(String nombre, int edad, String genero, Zona zona) {
        ranas++;
        return new Anfibio(nombre, edad, "selva", genero, zona, "rojo", true);
    }

    public static Anfibio crearSalamandras(String nombre, int edad, String genero, Zona zona) {
        salamandras++;
        return new Anfibio(nombre, edad, "selva", genero, zona, "negro", false);
    }
}
