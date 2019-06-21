/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personacapadatos;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import personas.dto.PersonaDTO;
import personas.jdbc.PersonaDao;
import personas.jdbc.PersonaDaoJDBC;

/**
 *
 * @author pedro
 */
public class PersonaCapaDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       PersonaDao personaDao = new PersonaDaoJDBC();
       PersonaDTO persona= new PersonaDTO();
       List <PersonaDTO> listaPersonas;
       
            /*  persona.setId_persona(7);
            persona.setNombre("Peter");
            persona.setApellido("Parker");
            try {
            personaDao.insert(persona);
            } catch (SQLException ex) {
            Logger.getLogger(PersonaCapaDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
            */
            try {
            listaPersonas=personaDao.select();
            for (int i=0; i<listaPersonas.size(); i++){
                System.out.println("Persona "+i+" = "+ listaPersonas.get(i));
            }
        } catch (SQLException ex) {
            Logger.getLogger(PersonaCapaDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    } 
    
}
