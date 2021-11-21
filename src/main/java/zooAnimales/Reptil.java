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
    public int iguanas;
    public int serpientes;
    private String colorEscamas;
    private int largoCola;

    public Reptil() {
        listado.add(this);
    }

    public Reptil(String nombre, int edad, String habitat, String genero, Zona zona, int iguanas, int serpientes, String colorEscamas, int largoCola) {
        super(nombre, edad, habitat, genero, zona);
        this.iguanas = iguanas;
        this.serpientes = serpientes;
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
        listado.add(this);
    }

    @Override
    public String movimiento() {
        return "reptar";
    }

    
}
