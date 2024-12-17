/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pergudangan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author downy
 */
public class Conn {
    private static Connection mysqlconn;
    public static Connection ConnDB() throws SQLException{
        
        if(mysqlconn==null){
            try{
                String DB = "jdbc:mysql://localhost:3308/Gudang?serverTimezone=Asia/Jakarta";
                String user = "root";
                String pass = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                mysqlconn=(Connection)DriverManager.getConnection(DB,user,pass);
                      
            }catch (Exception e){
                
            }
        }return mysqlconn; 
        
    }
    
}
