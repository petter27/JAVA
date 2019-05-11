/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;
import domain.Usuario;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author pedro
 */
public class UsuariosJDBC {
    private final String SQL_INSERT="INSERT INTO usuario (usuario,password) VALUES (?,?)";
    private final String SQL_UPDATE="UPDATE usuario set usuario=?,password=? WHERE id_usuario=?";
    private final String SQL_DELETE="DELETE FROM usuario where id_usuario=?";
    private final String SQL_SELECT="SELECT id_usuario,usuario,password FROM usuario";
    
    public int insert(String usuario, String password){
        Connection conn=null;
        PreparedStatement stmt=null;
        int rows=0;
        try {
            conn=conexion.getConnection();
            stmt=conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, usuario);
            stmt.setString(2, password);
           rows= stmt.executeUpdate();
            System.out.println("Registros afectados: "+rows);
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
        conexion.close(stmt);
        conexion.close(conn);
        }
         return rows;
    }
    
    public int update(int id_usuario,String usuario, String password){
    Connection conn=null;
    PreparedStatement stmt=null;
    int rows=0;
    
        try {
            conn=conexion.getConnection();
            stmt=conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, usuario);
            stmt.setString(2,password);
            stmt.setInt(3, id_usuario);
            rows=stmt.executeUpdate();
            System.out.println("Registros afectados: "+rows);
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
        conexion.close(stmt);
        conexion.close(conn);
        }
    return rows;
    }
    
    public int delete(int id_usuario){
    Connection conn=null;
    PreparedStatement stmt=null;
    int rows=0;
        try {
            conn=conexion.getConnection();
            stmt=conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, id_usuario);
            rows=stmt.executeUpdate();
            System.out.println("Registros afectados :"+rows);
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            conexion.close(stmt);
            conexion.close(conn);
        }  
    return rows;    
    }
    
    public List<Usuario> select(){
    Connection conn=null;
    PreparedStatement stmt=null;
    ResultSet rs=null;
    Usuario usr=null;
    List<Usuario> usrLista=new ArrayList<>();
        try {
            conn=conexion.getConnection();
            stmt=conn.prepareStatement(SQL_SELECT);
            rs=stmt.executeQuery();
            
            while(rs.next()){
                usr=new Usuario();
                usr.setId_usuario(rs.getInt(1));
                usr.setUsuario(rs.getString(2));
                usr.setPassword(rs.getString(3));
                usrLista.add(usr);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    return usrLista;
    }
}
