/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Thanh Ha
 */
public class MyProperties {
    public String url;
    public String userName;
    public String passWord;
  
    public  void getInformation(InputStream file)
    {
        Properties p=new Properties();
        try {
            p.load(file);
            url=p.getProperty("url");
            System.out.println(url);
            userName=p.getProperty("name");
            System.out.println(passWord);
            passWord=p.getProperty("pass");
            System.out.println(userName);
        } catch (IOException ex) {
            Logger.getLogger(MyProperties.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
