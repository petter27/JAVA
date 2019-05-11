/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import clases.persona;

/**
 *
 * @author pedro
 */
public class personanaPrueba {
    public static void main(String[] args) {
        persona p1=new persona();
        p1.nombre="Pedro";
        p1.apellidoMaterno="Martínez";
        p1.apellidoPaterno="Pacheco";
        p1.desplegarNombre();
    }
    
}
