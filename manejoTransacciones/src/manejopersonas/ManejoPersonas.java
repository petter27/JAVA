/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejopersonas;
import datos.conexion;
import datos.personaJDBC;
import domain.Persona;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        Connection conn=null;
        try {
            conn=conexion.getConnection();
            //Revisar si la conexion tiene activo el autoCommit para desactivarlo
            if(conn.getAutoCommit()){
                conn.setAutoCommit(false);
            }       
            personaJDBC personas=new personaJDBC(conn);
            personas.update(2, "Juan", "Gonzales");
            personas.insert("error", "corregjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjido");
            conn.commit();
                    } catch (SQLException ex) {
            try {
                System.out.println("Algo salio mal... No se guardaron los cambios");
                ex.printStackTrace(System.out);
                conn.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
       
        
    }
    
}
