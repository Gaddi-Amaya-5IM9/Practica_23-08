/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Práctica;

/**
 *
 * @author Alumno
 */
public class Práctica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Computadora computadora1 = new Computadora("DELL");
        Computadora computadora2 = new Computadora("HP", "Envy DV7");
        Computadora computadora3 = new Computadora("Lenovo", "ThinkPad","Intel Core i3");
        Computadora computadora4 = new Computadora("Acer", "Veriton", "Intel Core i5", 8);
        Computadora computadora5 = new Computadora("MSI", "TITAN", "Intel Core i7", 16, 1024);
        
        
        computadora1.Imprimir();
        System.out.println("");
        computadora2.Imprimir();
        System.out.println("");
        computadora3.Imprimir();
        System.out.println("");
        computadora4.Imprimir();
        System.out.println("");
        computadora5.Imprimir();
    }
    
}
