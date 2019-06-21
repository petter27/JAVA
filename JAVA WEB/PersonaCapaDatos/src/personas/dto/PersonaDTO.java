/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas.dto;

/**
 *
 * @author pedro
 */
public class PersonaDTO  {
    
    private int id_persona;
    private String nombre;
    private String Apellido;
    
    public PersonaDTO(){}
    
    public PersonaDTO(int id_persona){
        this.id_persona=id_persona;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    @Override
    public String toString() {
        return "PersonaDTO{" + "id_persona=" + id_persona + ", nombre=" + nombre + ", Apellido=" + Apellido + '}';
    }
    
    
    
}
