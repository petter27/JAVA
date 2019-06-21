/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capadatos.pool;
import java.sql.*;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;
/**
 *
 * @author pedro
 */
public class PoolConexionesMysql {
    public static DataSource getDataSource(){
    BasicDataSource ds=new BasicDataSource();
    ds.setDriverClassName("com.mysql.jdbc.Driver");
    ds.setUsername("root");
    ds.setPassword("");
    ds.setUrl("jdbc:mysql://localhost:3306/sga?useSSL=false");
    //definir la cantidad de conexiones disponibles
    ds.setInitialSize(5);
    return ds;
    }
    
  public static Connection getConnection() throws SQLException{
      return getDataSource().getConnection();
  }
}
