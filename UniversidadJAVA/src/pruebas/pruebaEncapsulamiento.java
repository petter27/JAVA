/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

/**
 *
 * @author pedro
 */
public class pruebaEncapsulamiento {
    public static void main(String[] args) {
        Persona p1 =new Persona();
        p1.setNombre("Pedro");
        p1.setApellidoPaterno("Pacheco");
        p1.setApellidoMaterno("Martínez");
        System.out.println("Nombre: "+p1.getNombre());
        System.out.println("Apellido Paterno: "+p1.getApellidoPaterno());
        System.out.println("Apellido Materno: "+p1.getApellidoMaterno());
    }
}

class Persona{
    private String nombre;
    private String ApellidoPaterno;
    private String ApellidoMaterno;
    
    public String getNombre() {
        return this.nombre;
    }
    public String getApellidoPaterno() {
        return this.ApellidoPaterno;
    }
    public String getApellidoMaterno() {
        return this.ApellidoMaterno;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setApellidoPaterno(String apellidoPat){
        this.ApellidoPaterno=apellidoPat;
    }
    public void setApellidoMaterno(String apellidoMat){
        this.ApellidoMaterno=apellidoMat;
    }
}