/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkap.Connection;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ScorPius 31
 */
public class D_Connection {
    public static final String DRIVER="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    public static final String URL="jdbc:sqlserver://SCORPIUS-31\\SQLEXPRESS:51928;databaseName=ProjectShop";
    public static final String USER="sa";
    public static final String PASS="Dungvn14141999";
    
    public static Connection openDataBase(){
        Connection conn=null;
        try {
            Class.forName(DRIVER);
            conn=DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
    
    public static void closeDataBase(Connection conn,CallableStatement call){
        if(conn==null){
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(D_Connection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(call==null){
            try {
                call.close();
            } catch (SQLException ex) {
                Logger.getLogger(D_Connection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
