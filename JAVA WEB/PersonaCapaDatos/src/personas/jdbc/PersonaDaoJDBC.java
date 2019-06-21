/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import personas.dto.PersonaDTO;

/**
 *
 * @author pedro
 */
public class PersonaDaoJDBC implements PersonaDao {
    private Connection userConn;
    
    private final String SQL_INSERT = "INSERT INTO persona(nombre,apellido) VALUES (?,?)";
    private final String SQL_UPDATE = "UPDATE persona SET nombre=?, apellido=? WHERE id_persona=?";
    private final String SQL_DELETE = "DELETE FROM persona WHERE id_persona=?";
    private final String SQL_SELECT = "SELECT id_persona, nombre, apellido FROM persona";
    
    public PersonaDaoJDBC(){}
    
    public PersonaDaoJDBC(Connection conn){
        this.userConn=conn;
    }
    
    
    @Override
    public int insert(PersonaDTO persona) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt= null;
        int rows = 0;
        try{
            conn=(this.userConn!=null) ? this.userConn : Conexion.getConnection();
            stmt=conn.prepareStatement(SQL_INSERT);
            stmt.setString(1,persona.getNombre());
            stmt.setString(2, persona.getApellido());
            rows=stmt.executeUpdate();
            System.out.println("Registro agregado correctamente");
        }finally{
            Conexion.close(stmt);
            if(this.userConn==null){
                Conexion.close(conn);
            }
        }
        return rows;
    }

    @Override
    public int update(PersonaDTO persona) throws SQLException {
        Connection conn=null;
        PreparedStatement stmt = null;
        int rows = 0;
        try{
            conn=(this.userConn!=null) ? this.userConn : Conexion.getConnection();
            stmt=conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getApellido());
            stmt.setInt(3, persona.getId_persona());
            rows=stmt.executeUpdate();
            System.out.println("Registro Actualizado");
        }finally{
            Conexion.close(stmt);
            if(this.userConn==null){
                Conexion.close(conn);
            }
        }
        return rows;
    }

    @Override
    public int delete(PersonaDTO persona) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;  
        try{
            conn=(this.userConn!=null) ? this.userConn : Conexion.getConnection();
            stmt=conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, persona.getId_persona());
            rows=stmt.executeUpdate();
            System.out.println("Registro eliminado");
        }finally{
            Conexion.close(stmt);
            if(this.userConn==null){
                Conexion.close(conn);
            }
        }
        return rows;
    }

    @Override
    public List<PersonaDTO> select() throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs= null;
        PersonaDTO personaDTO = null;
        List<PersonaDTO> personas=new ArrayList<>();
        try{
            conn=(this.userConn != null ) ? this.userConn : Conexion.getConnection();
            stmt=conn.prepareStatement(SQL_SELECT);
            rs=stmt.executeQuery();
            personaDTO= new PersonaDTO();
            while(rs.next()){
                personaDTO.setId_persona(rs.getInt(1));
                personaDTO.setNombre(rs.getString(2));
                personaDTO.setApellido(rs.getString(3));
                personas.add(personaDTO);
            }
        }finally{
            Conexion.close(rs);
            Conexion.close(stmt);
            if(this.userConn==null){
                Conexion.close(conn);
            }  
    }
        return personas;
    }
}
