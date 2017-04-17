/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Thanh Ha
 */
public class Test {
    public static void getBundle(String nameFile)
    {

        Locale.setDefault(new Locale("vn","VN"));
        ResourceBundle rb=ResourceBundle.getBundle(nameFile);
        Enumeration<String> value = rb.getKeys();
        
       while(value.hasMoreElements())
       {
           System.out.println(rb.getString((value.nextElement())));
       }
        System.out.println(Locale.getDefault());
    }
     
    public static void main(String[] args)
    {
        Test.getBundle("demoResource_vn_VN");
    }
   
}
