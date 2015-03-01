/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.mockup;
import java.sql.*;
/**
 *
 * @author Gilberto
 */
public class JavaSQL {
    public static void main(String[] args){
        String url = "jdbc:derby://localhost:1527/";
        String dbName = "PMdata";
        String driver = "cm.mysql.jdbc.Driver";
        String userName = "a";
        String password = "a";
        try {Class.forName(driver).newInstance();
        Connection conn = DriverManager.getConnection
                                (url+dbName,userName,password);
        conn.close();}catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void insertDB(String taskName,int duration,String description,String colour,String dependencies,String esd,String eed){
       String sql = "INSERT INTO PMdata(taskName,duration,description,colour,dependencies,esd,eed,null,null,null)";
    }
}
