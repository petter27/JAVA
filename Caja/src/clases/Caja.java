/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author pedro
 */
public class Caja {
    public int ancho;
    public int alto;
    public int profundo;
    
    public Caja(){}
    
    public Caja(int ancho, int alto, int profundo){
    this.alto=alto;
    this.ancho=ancho;
    this.profundo=profundo;
    }
    
    public int calcularVolumen(){
       int volumen=ancho*ancho*profundo;
       return volumen;
    }
}
