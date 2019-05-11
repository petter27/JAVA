/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejopersonas;
import datos.personaJDBC;
import domain.Persona;
import java.util.List;
/**
 *
 * @author pedro
 */
public class ManejoPersonas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        personaJDBC personasJDBC=new personaJDBC();
        //personasJDBC.insert("Armando", "Pacheco");
        //personasJDBC.update(3, "Jose", "Martinez");
        //personasJDBC.Delete(3);
        
        List<Persona> personas=personasJDBC.select();
        
        for(Persona persona:personas){
            System.out.println("id: "+persona.getId_persona());
            System.out.println("nombre: "+persona.getNombre());
            System.out.println("Apellido: "+persona.getApellido());
        }
        
    }
    
}
