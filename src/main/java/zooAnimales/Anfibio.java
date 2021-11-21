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
    private ArrayList<Anfibio> listado;
    public int ranas;
    public int salamandras;
    private String colorPiel;
    private boolean venenoso;

    public Anfibio() {
        listado.add(this);
    }

    public Anfibio(String nombre, int edad, String habitat, String genero, Zona zona, int ranas, int salamandras, String colorPiel, boolean venenoso) {
        super(nombre, edad, habitat, genero, zona);
        this.ranas = ranas;
        this.salamandras = salamandras;
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        listado.add(this);
    }

    @Override
    public String movimiento() {
        return "saltar";
    }
    
}
