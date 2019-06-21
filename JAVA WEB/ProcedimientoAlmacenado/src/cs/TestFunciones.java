/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs;
import datos.Conexion;
import java.sql.*;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pedro
 */
public class TestFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int empleadoId = 100;
        try {
            Connection conn = Conexion.getConnection();
            CallableStatement cstmt = null;
            double salarioMensual;
            cstmt = conn.prepareCall("{? = call get_employee_salary(?)}");
            cstmt.registerOutParameter(1, java.sql.Types.INTEGER);
            cstmt.setInt(2, empleadoId);
            cstmt.execute();
            salarioMensual=cstmt.getDouble(1);
            System.out.println("Salario: "+ salarioMensual);
            cstmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(TestFunciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
