/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjdbc;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.*;

/**
 *
 * @author pedro
 */
public class IntroJDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/sga?useSSL=false";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion=(Connection) DriverManager.getConnection(url, "root","");
            Statement instruccion=(Statement) conexion.createStatement();
            String sql="SELECT id_persona,nombre,apellido FROM persona";
            ResultSet result=instruccion.executeQuery(sql);
            while(result.next()){
                System.out.println("id: "+result.getInt(1));
                System.out.println("Nombre: "+result.getString(2));
                System.out.println("Apellido: "+result.getString(3));
            }
            result.close();
            instruccion.close();
            conexion.close();
        }catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
        
    }
    
}
