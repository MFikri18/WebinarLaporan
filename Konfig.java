/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc_mfikri;

/**
 *
 * @author Fikham
 */
import java.sql.*;
public class Konfig {
    private static Connection MySQLConfig;
    public static Connection configDB() throws SQLException{
        try {
            String url = "jdbc:mysql://localhost:3307/latihanjava_mfikri20tib";
            String user = "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MySQLConfig=DriverManager.getConnection(url, user, pass);
        }catch (SQLException e){
            System.out.println("Koneksi Gagal "+e.getMessage());
        }
        return MySQLConfig;
    }
}
