/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caja;

import clases.Caja;

/**
 *
 * @author pedro
 */
public class Caja_P {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Caja caja1=new Caja();
        caja1.ancho=3;
        caja1.alto=2;
        caja1.profundo=6;
        
        Caja caja2=new Caja(3,2,6);
        int volumen=caja1.calcularVolumen();
        int volumen2=caja2.calcularVolumen();
        System.out.println("El volumen es "+volumen);
        
    }
    
}
