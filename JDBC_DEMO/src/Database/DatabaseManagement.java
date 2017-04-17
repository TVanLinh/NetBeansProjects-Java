/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Thanh Ha
 */
public class DatabaseManagement {
    private static DatabaseManagement instance;
    private Connection conn;
    
    private  DatabaseManagement()
    {
        
    }
    public  static DatabaseManagement getInstance()
    {
        return instance=new DatabaseManagement();
    }
    
    public Connection getConnection()
    {
        if(this.conn!=null)
        {
            return this.conn;
        }
        try {
           // Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile","root","");
            return conn; 
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseManagement.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Loi roi nhe");
        }
        return conn;
    }
    public void disConnection() throws SQLException
    {
        if(conn!=null && conn.isClosed())
        {
            conn.close();
        }
        conn=null;
    }
}
