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
public class Anfibio extends Animal {
    private static ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
    public static int ranas = 0;
    public static int salamandras = 0;
    private String colorPiel;
    private boolean venenoso;

    public Anfibio() {
        super();
        listado.add(this);
    }

    public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
        super(nombre, edad, habitat, genero);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        listado.add(this);
    }

    public static ArrayList<Anfibio> getListado() {
        return listado;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }
    
    public static int cantidadAnfibios() {
        return listado.size();
    }

    @Override
    public String movimiento() {
        return "saltar";
    }
    
    public static Anfibio crearRana(String nombre, int edad, String genero) {
        ranas++;
        Anfibio anfibio = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
        return anfibio;
    }

    public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
        salamandras++;
        Anfibio anfibio = new Anfibio(nombre, edad, "selva", genero, "negro", false);
        return anfibio;
    }
}
