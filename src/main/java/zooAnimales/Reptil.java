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
public class Reptil extends Animal {
    private static ArrayList<Reptil> listado;
    public static int iguanas;
    public static int serpientes;
    private String colorEscamas;
    private int largoCola;

    public Reptil() {
        listado.add(this);
    }

    public Reptil(String nombre, int edad, String habitat, String genero, Zona zona, String colorEscamas, int largoCola) {
        super(nombre, edad, habitat, genero, zona);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
        listado.add(this);
    }
    
    public int cantidadReptiles() {
        return listado.size();
    }
    
    @Override
    public String movimiento() {
        return "reptar";
    }

    public static Reptil crearIguana(String nombre, int edad, String genero, Zona zona) {
        iguanas++;
        return new Reptil(nombre, edad, "humedal", genero, zona, "verde", 3);
    }
    
    public static Reptil crearSerpiente(String nombre, int edad, String genero, Zona zona) {
        serpientes++;
        return new Reptil(nombre, edad, "jungla", genero, zona, "blanco", 1);
    }

}
