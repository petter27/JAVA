/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import clases.Bebida;
import clases.Producto;

/**
 *
 * @author pedro
 */
public class HerenciaPrueba {
    public static void main(String[] args) {
        Producto p1=new Producto();
        Bebida b1=new Bebida();
        b1.producto=p1;
    b1.producto.nombre="Coca Cola";
    b1.producto.Descripcion="Producto universal de cola";
    b1.precio="0.50";
    b1.tipo="Refresco gaseoso";
    
        System.out.println("Producto: "+b1.producto.nombre);
        System.out.println("Precio: "+b1.precio);
    }
    
    
}