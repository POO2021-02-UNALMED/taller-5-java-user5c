
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
        Zona z1 = new Zona();
        Zona z2 = new Zona();
        zoo.agregarZonas(z1);
        zoo.agregarZonas(z2);
        z1.agregarAnimales(Mamifero.crearCaballo("test", 11, "M"));
        z1.agregarAnimales(Mamifero.crearCaballo("test", 11, "M"));
        z1.agregarAnimales(Mamifero.crearLeon("test", 11, "M"));
        z1.agregarAnimales(Ave.crearHalcon("test", 11, "M"));
        z1.agregarAnimales(Ave.crearHalcon("test", 11, "M"));
        z1.agregarAnimales(Ave.crearAguila("test", 11, "M"));
        z1.agregarAnimales(Ave.crearAguila("test", 11, "M"));
        z1.agregarAnimales(Anfibio.crearRana("test", 11, "M"));
        z2.agregarAnimales(Anfibio.crearSalamandra("test", 11, "M"));
        z2.agregarAnimales(Reptil.crearIguana("test", 11, "M"));
        z2.agregarAnimales(Reptil.crearSerpiente("test", 11, "M"));
        z2.agregarAnimales(Pez.crearSalmon("test", 11, "M"));
        z2.agregarAnimales(Pez.crearBacalao("test", 11, "M"));
        Mamifero.crearCaballo("test", 11, "M");
        Ave.crearHalcon("test", 11, "M");
        Anfibio.crearRana("test", 11, "M");
        Reptil.crearIguana("test", 11, "M");
        Pez.crearBacalao("test", 11, "M");
        
        System.out.println(zoo.getZona().get(0).cantidadAnimales());
        System.out.println(zoo.cantidadTotalAnimales());
        
    }
    
}
