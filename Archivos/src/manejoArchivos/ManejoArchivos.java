/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoArchivos;

import static utileria.Archivos.*;

/**
 *
 * @author pedro
 */
public class ManejoArchivos {
    
    private static final String NOMBRE_ARCHIVO = "C:\\Users\\pedro\\Documents\\NetBeansProjects\\Archivos\\ArchivosPrueba\\pruebaJAVA.txt";
    
    public static void main(String[] args) {
        crearArchivo(NOMBRE_ARCHIVO);
        escribirArchivo(NOMBRE_ARCHIVO);
        leerArchivo(NOMBRE_ARCHIVO);
        anexarArchivo(NOMBRE_ARCHIVO);
        leerArchivo(NOMBRE_ARCHIVO);
    }
}
