
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import test.MyProperties;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thanh Ha
 */
public class DataBaseManager {
    Connection connection=null;
    Statement stm=null;
    public void  getConnection(InputStream file)
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            MyProperties properties=new MyProperties();
            properties.getInformation(file);
            connection=DriverManager.getConnection(properties.url, properties.userName, properties.passWord);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataBaseManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(connection!=null)
        {
            System.out.println("Connect successfully");
        }
    }
    public void creatStatement() throws SQLException
    {
        stm=connection.createStatement();
    }
    public void  getData()
    {
        try {
            creatStatement();
            String query="select * from user2";
            ResultSet result=stm.executeQuery(query);
            result.first();
            while(result.next())
            {
                System.out.println(result.getString(1));
                System.out.println(result.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void  insertData(String user,String pass) throws SQLException
    {
        String query="insert into user2 value(?,?)";
        PreparedStatement   pp=connection.prepareStatement(query);
        pp.setString(1, user);
        pp.setString(2, pass);
        pp.executeUpdate();
        //connection.commit();
    }
    public static void main(String [] args) throws SQLException
    {
        System.out.println(Arrays.asList(args));
        DataBaseManager data=new DataBaseManager();
        try {
            InputStream inputStream =new FileInputStream(
                    DataBaseManager.obtainDBType(args));
            data.getConnection(inputStream);
            data.getData();
            data.insertData("456", "48976655");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DataBaseManager.class.getName()).log(Level.SEVERE, 
                    null, ex);
        }
    }
    
    public static final String DEFAULT_DB = "data_1.properties";
    
    public static String obtainDBType(String [] args) {
        String dbType = DataBaseManager.DEFAULT_DB;
        if (args.length > 0) {
            switch (args[0]) {
                case "data_2":
                    dbType = "data_2.properties";                      
            }
        }
        System.out.println(dbType);
        
        return dbType;
    }
}
