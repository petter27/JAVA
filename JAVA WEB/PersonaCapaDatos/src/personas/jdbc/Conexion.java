/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas.jdbc;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author pedro
 */
public class Conexion {
    private static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
    private static final String JDBC_URL="jdbc:mysql://localhost/sga?useSSL=false";
    private static final String JDBC_PASSWORD="";
    private static final String JDBC_USER = "root";
    private static  Driver driver = null;
    
    public static synchronized Connection getConnection() throws SQLException{
        
        if(driver==null){
            try{
    Class jdbcDriver=Class.forName(JDBC_DRIVER);
           driver= (Driver) jdbcDriver.newInstance();
           DriverManager.registerDriver(driver);
            }catch(Exception ex){
                System.out.println("Falló en cargar el driver");
                ex.printStackTrace();
            }
        }
        return DriverManager.getConnection(JDBC_URL,JDBC_USER,JDBC_PASSWORD);
    }
    
    public static void close(ResultSet rs){
        if(rs!=null){
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static void close(PreparedStatement stmt){
        if(stmt!=null){
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static void close (Connection conn){
        if(conn!=null){
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
