/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;
import java.sql.*;
import metodo.Conexion;
/**
 *
 * @author FRANCIS
 */
public class inicioSesion {
    //metodo que ayuda a iniciar sesion de forma correcta :)
        public boolean consultaInicioSesion(String usuario, String contraseña){
//            Conexion conexion = new Conexion();
//            Connection conn = conexion.conectar();
            
           if(usuario == null || contraseña == null || usuario.isEmpty() || contraseña.isEmpty()){
               return false;
           } 
            String sql = "Select * from usuarios_info WHERE nombre_usuario =? AND contraseña =?";
        
//       try{
//           PreparedStatement ps = conn.prepareStatement(sql);
//           ps.setString(1, "nombre_usuario");
//           ps.setString(2, "contraseña");
//           
//           ResultSet resultadoSeteado = ps.executeQuery();
//           if(resultadoSeteado.next()){
//               return  (true);
//           }else{
//               return false;
//           }
//       }catch(SQLException e){
//           System.out.println("Error al iniciar sesión: "  + e.getMessage());
//           return false;
//       }
       

        try (Connection cn = new Conexion().conectar();
             PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setString(1, usuario);
            ps.setString(2, contraseña);

            try (ResultSet rs = ps.executeQuery()) {
                return rs.next(); 
            }

        } catch (SQLException e) {
            System.err.println("Error al verificar el login: " + e.getMessage());
            return false;
        }
//        try {
//            String consultaLogin = "SELECT * FROM left4tech.usuarios_info";
//            Statement declaracion= conn.createStatement();
//            ResultSet resultadoSeteado = declaracion.executeQuery(consultaLogin);
//        } catch (SQLException ex) {
//            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
}
