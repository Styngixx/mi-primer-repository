package metodo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FRANCIS
 */
public class Conexion {
    String db="left4tech";
    String user="root";
    String password="Chap04";
    String url="jdbc:mysql://localhost:3306/";
    String driver="com.mysql.cj.jdbc.Driver";
    Connection conn=null;

public Connection conectar () {
    try {
        Class.forName(driver);
        conn = DriverManager.getConnection(url + db, user, password);
        System.out.println("+ Conexión exitosa a la base de datos " + db);
    } catch (SQLException | ClassNotFoundException ex) {
        System.out.println("- Error de conexión: " + ex.getMessage());
        Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
    }
    return conn;
    }        
}
    
