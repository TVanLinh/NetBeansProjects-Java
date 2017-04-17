/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

/**
 *
 * @author Thanh Ha
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException 
    {
        Properties p=new Properties();
        InputStream inpStream = new FileInputStream("data.properties");
        OutputStream out=new FileOutputStream("data.properties");
        p.load(inpStream);
        System.out.println(p.getProperty("name"));
        p.setProperty("name","Tran van linh");
        System.out.println(p.getProperty("name"));
        p.store(out,"finished");
    }
}
