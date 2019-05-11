/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pedro
 */
public class conexion {
    
    private static String JDBC_STRING="com.mysql.jdbc.Driver";
    private static String JDBC_URL="jdbc:mysql://localhost:3306/sga?useSSL=false";
    private static String JDBC_USER="root";
    private static String JDBC_PASS="";
    private static Driver driver=null;
    
    public static synchronized Connection getConnection() throws SQLException{
        if(driver==null){
            try {
              Class jdbcDriverClass=Class.forName(JDBC_STRING);
              driver=(Driver) jdbcDriverClass.newInstance();
              DriverManager.registerDriver(driver);
            } catch (Exception e) {
                System.out.println("Falló en cargar el driver");
                e.printStackTrace();
            }
        }
        return DriverManager.getConnection(JDBC_URL,JDBC_USER,JDBC_PASS);
    }
    
    public static void close(ResultSet rs){
        if(rs!=null){
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public static void close(PreparedStatement stmt){
    if(stmt!=null){
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static void close(Connection conn){
    if(conn!=null){
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
