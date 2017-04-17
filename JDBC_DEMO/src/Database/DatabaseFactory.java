/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import DAO.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseFactory {
    DatabaseManagement dm;
    ResultSet set;
    Statement stm;
    PreparedStatement pstm;
    public DatabaseFactory()
    {
        dm=DatabaseManagement.getInstance();
    }
    
    public List<User> getALLUser()
    {
        List<User> users=new ArrayList<User>();
        String query="select *from user2";
        User user;
        try {
            stm=dm.getConnection().createStatement();
            set=stm.executeQuery(query);
          //  set.first();
            while(set.next())
            {
                user=new User();
                user.setName(set.getString(1));
                user.setPassWord(set.getString(2));
                users.add(user);
                
            }
            stm.close();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return users;
    }
    
    public Boolean insertUser(User user)
    {
        String query="insert into user2 values(?,?)";
        try {
            pstm=dm.getConnection().prepareStatement(query);
            pstm.setString(1,user.getName());
            pstm.setString(2,user.getPassWord());
            pstm.executeUpdate();
            pstm.close();
             return true;
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseFactory.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
   
    public static void testTransaction()
    {
        //test transaction
        DatabaseFactory df=new DatabaseFactory();
        String query="insert into user2 values(?,?)";
        try {
            df.dm.getConnection().setAutoCommit(false);
            df.pstm= df.dm.getConnection().prepareStatement(query);
            
            df.pstm.setString(1,"ABd");
            df.pstm.setString(2,"12356");
            df.pstm.executeUpdate();
             
            df.pstm.setString(1,"BCd");
            df.pstm.setString(2,"12356");
            df.pstm.executeUpdate();
            df.dm.getConnection().commit();
            
            df.pstm.setString(1, "CD");
            df.pstm.setString(2, "12356");
            df.pstm.executeUpdate();
            df.pstm.close();
            
            df.dm.getConnection().rollback();
            df.dm.getConnection().commit();
            df.dm.getConnection().setAutoCommit(true);
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
   
     public static void main(String[] args)
    {
      testTransaction();
    }
}
