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
public class persona {
   public String nombre;
   public String apellidoPaterno;
   public String apellidoMaterno;
    
    public void desplegarNombre(){
        System.out.println("nombre: "+nombre);
        System.out.println("Apellido paterno: "+apellidoPaterno);
        System.out.println("Apellido materno: "+apellidoMaterno);
    }
}
