package clases;

import java.sql.*;
import database.Conexion;
/**
 *
 * @author FRANCIS
 */
public class inicioSesion {
    //metodo que ayuda a iniciar sesion de forma correcta :)
        public boolean consultaInicioSesion(String usuario, String contraseña){
            
           if(usuario == null || contraseña == null || usuario.isEmpty() || contraseña.isEmpty()){
               return false; // no setea nada, es decir que no da acceso al usuario.
           } 
            String sql = "Select * from usuarios_info WHERE nombre_usuario =? AND contraseña =?";

        try (Connection cn = new Conexion().conectar();
             PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setString(1, usuario);
            ps.setString(2, contraseña);

            try (ResultSet rs = ps.executeQuery()) {
                return rs.next(); //un salto para que se ejecute de forma correcta la consulta SQL.
            }

        } catch (SQLException e) {
            System.err.println("Error al verificar el login: " + e.getMessage());
            return false;
        }
    }
}
