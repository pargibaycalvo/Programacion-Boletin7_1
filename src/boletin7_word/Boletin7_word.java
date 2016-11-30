/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7_word;

/**
 *
 * @author Ped90
 */
public class Boletin7_word {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro unLibro = new Libro("Pel de lobo","Pedro",7,8);
        unLibro.prestamo();
        unLibro.devolucion();
        System.out.println(unLibro.toString());
               
    }
    
}
    
    

