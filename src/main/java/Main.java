
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
