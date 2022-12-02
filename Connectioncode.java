/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConnectionProvider;

//import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.*;
import java.sql.DriverManager;
/**
 *
 * @author krish
 */
public class Connectioncode {
    public static Connection getcon(){
        try{
          Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentResult", "root", "Mysql");
           return con;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
            return null;
        }
      
    }
    public static void main(String args[]){
        Connectioncode obj = new Connectioncode();
       Connection c =  obj.getcon();
    }
    
}
