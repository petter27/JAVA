/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import domain.Persona;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author pedro
 */
public class personaJDBC {
    private final String SQL_INSERT="INSERT INTO persona(nombre,apellido) VALUES (?,?)";
    private final String SQL_UPDATE="UPDATE persona SET nombre=?, apellido=? WHERE id_persona=?";
    private final String SQL_DELETE="DELETE FROM persona WHERE id_persona=?";
    private final String SQL_SELECT="SELECT id_persona,nombre,apellido FROM persona ORDER BY id_persona";
    
    public int insert(String nombre,String apellido){
        Connection conn=null;
        PreparedStatement stmt=null;
        int rows=0;
        
        try {
            conn=conexion.getConnection();
            stmt=conn.prepareStatement(SQL_INSERT);
            int index=1;
            stmt.setString(index++, nombre);
            stmt.setString(index++, apellido);
            rows=stmt.executeUpdate(); //regresa el numero de registros afectados
            System.out.println("Registros afectados: "+rows);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
        conexion.close(stmt);
        conexion.close(conn);
        }
        return rows;
    } 
    
    public int update(int id_persona,String nombre,String apellido){
        Connection conn=null;
        PreparedStatement stmt=null;
        int rows=0;
        
        try {
            conn=conexion.getConnection();
            stmt=conn.prepareStatement(SQL_UPDATE);
            int index=1;
            stmt.setString(index++, nombre);
            stmt.setString(index++, apellido);
            stmt.setInt(index, id_persona);
            rows=stmt.executeUpdate();
            System.out.println("Registros actualizados: "+rows);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
        conexion.close(stmt);
        conexion.close(conn);
        }
        return rows;
    }
    
    public int Delete(int id_persona){
        Connection conn=null;
        PreparedStatement stmt=null;
        int rows=0;
       
        try{
        conn=conexion.getConnection();
        stmt=conn.prepareStatement(SQL_DELETE);
        stmt.setInt(1,id_persona);
        rows=stmt.executeUpdate();
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{
        conexion.close(stmt);
        conexion.close(conn);
        }
        return rows;
    }
    
    public List<Persona> select(){
        Connection conn=null;
        PreparedStatement stmt=null;
        ResultSet rs=null;
        Persona persona=null;
        List<Persona> personas=new ArrayList<Persona>();
        try {
            conn=conexion.getConnection();
            stmt =conn.prepareStatement(SQL_SELECT);
            rs=stmt.executeQuery();
            while(rs.next()){
                persona=new Persona();
                persona.setId_persona(rs.getInt(1));
                persona.setNombre(rs.getString(2));
                persona.setApellido(rs.getString(3));
              personas.add(persona);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
        conexion.close(rs);
        conexion.close(rs);
        conexion.close(conn);
        }
        return personas;
    }
}
