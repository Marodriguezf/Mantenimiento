
package modelo;
import java.sql.*;

/**
 *
 * @author aleja
 */
public class Conexion {
    
    public Conexion(){
        
    }
    public Connection getConexion(){
        Connection con= null;
        
        try{
            /*Instanciar el driver de mi Base de datos*/
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            /*Conexion a base de datos*/
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_persona","root","Rocky2022**");
        } catch (Exception e) {
            
        }
        return con;
    }
}
