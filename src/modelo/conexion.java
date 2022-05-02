/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ema01
 */
public class conexion {



    private static Connection conn = null;
   private static String login = "objetos2"; //Nombre de usuario de la base de datos
   private static String clave = "objetos2";
   private static String url = "jdbc:oracle:thin:@localhost:1521:XE";
    
   //Metodo de Apertura de la conexion
   public static Connection getConnection() throws SQLException{
       try {
           Class.forName("oracle.jdbc.driver.OracleDriver");
           conn = DriverManager.getConnection(url, login, clave);
           conn.setAutoCommit(false);
           if(conn != null){
               System.out.print("Conexion OK");
           }else{
               System.err.print("No se ha ralizado la conexion");           
           }          
       } catch (ClassNotFoundException|SQLException e) {
           JOptionPane.showMessageDialog(null, "Conexion Erronea");
       }      
       return conn;
   }
   
   //Metodo de cierre de la conexion
   public void CloseConection(){
       try {
           conn.close();
       } catch (SQLException e) {
           System.out.println("Error en el cierre de la conexion" + e.getMessage());
       }
    }
   }//cierre de la clase

        
