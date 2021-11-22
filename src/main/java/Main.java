
import gestion.*;
import zooAnimales.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author camilo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Zoologico zoo = new Zoologico();
        Zoologico zoo1 = new Zoologico("Zoologico 1", "Ubicación 1");
        
        Zona z1 = new Zona();
        Zona z2 = new Zona("zona2", zoo);
        Zona z3 = new Zona("zona3", zoo1);
        
        
        System.out.println(z1);
        System.out.println(z1.getNombre());
        System.out.println(z1.getZoo());
        System.out.println("-----");
        System.out.println(z2);
        System.out.println(z2.getNombre());
        System.out.println(z2.getZoo());
        System.out.println(z2.getZoo().getNombre());
        System.out.println("-----");
        System.out.println(z3);
        System.out.println(z3.getNombre());
        System.out.println(z3.getZoo());
        System.out.println(z3.getZoo().getNombre());
        
        z2.agregarAnimales(Mamifero.crearCaballo("caballo1", 11, "F"));
        System.out.println(Mamifero.totalPorTipo());
        
        new Anfibio();
        new Anfibio();
        new Mamifero();
        new Mamifero();
        new Mamifero();
        new Reptil();
        new Pez();
        new Ave();
        new Ave();
        
        System.out.println(Animal.totalPorTipo());
        
    }
    
}
