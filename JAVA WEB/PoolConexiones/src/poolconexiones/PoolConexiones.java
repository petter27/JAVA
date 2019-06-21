/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poolconexiones;

import capadatos.pool.PoolConexionesMysql;
import capadatos.pool.PoolConexionesOralce;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pedro
 */
public class PoolConexiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection conn=null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            conn=PoolConexionesMysql.getConnection();
            stmt=conn.prepareStatement("select * from persona");
            rs= stmt.executeQuery();
            System.out.println("");
            System.out.println("DESDE BASE DE DATOS MYSQL");
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2) +" "+ rs.getString(3));  
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(PoolConexiones.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        try {
            conn=PoolConexionesOralce.getConnection();
            stmt=conn.prepareStatement("SELECT * FROM employees WHERE employee_id IN (100,101,102)");
            rs= stmt.executeQuery();
            System.out.println("");
            System.out.println("DESDE BASE DE DATOS ORACLE");
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2) +" "+ rs.getString(3));  
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(PoolConexiones.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
