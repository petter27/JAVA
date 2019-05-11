/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;
import clases.Operaciones;
/**
 *
 * @author pedro
 */
public class Matematicas {
    public static void main(String[] args) {
        Operaciones op1=new Operaciones();
        int suma=op1.sumar(43, 45);
        System.out.println(suma);
    }
}
