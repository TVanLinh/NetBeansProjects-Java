/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import DAO.User;
import Database.DatabaseFactory;
import Database.DatabaseManagement;
import java.util.List;

/**
 *
 * @author Thanh Ha
 */
public class Main {
    public static void main(String[] args)
    {
        DatabaseFactory dmf=new DatabaseFactory();
//        List<User> users=dmf.getALLUser();
//        for(User user:users)
//        {
//            System.out.println(user.getName());
//        }
        //System.out.println(DatabaseManagement.getInstance().getConnection());insertUser
        System.out.println(dmf.insertUser(new User("Ancncn","13344")));
    }
}
