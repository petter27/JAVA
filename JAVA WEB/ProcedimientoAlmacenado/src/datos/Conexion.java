/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author pedro
 */
public class Conexion {
    private static String j_driver;
    private static String j_url;
    private static String j_user;
    private static String j_pass;
    private static Driver driver;
    private static String file_name="jdbc";
    
    public static Properties loadProperties(String file){
            Properties prop=new Properties();
            ResourceBundle bundle=ResourceBundle.getBundle(file);
            Enumeration e=bundle.getKeys();
            String key =null;
            while(e.hasMoreElements()){
                key=(String) e.nextElement();
                prop.put(key,bundle.getObject(key));
            }
            j_driver = prop.getProperty( "driver");
            j_url = prop.getProperty("url");
            j_user = prop.getProperty("user");
            j_pass = prop.getProperty("pass");
           
    return prop;
    }
    
    public static synchronized Connection getConnection () throws SQLException{
        if(driver==null){
            try{
                loadProperties(file_name);
                Class jdbcDriver=Class.forName(j_driver);
                driver = (Driver) jdbcDriver.newInstance();
                DriverManager.registerDriver(driver);
                
            }catch(Exception e){
                System.out.println("Falló la conexion");
                e.printStackTrace();
            }
        }
        return DriverManager.getConnection(j_url,j_user,j_pass);
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
    
    public static void close(Connection conn){
        if(conn!=null){
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
}
