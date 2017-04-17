/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializationdemo;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Thanh Ha
 */
public class Serialization_DEMO {
    public static void main(String[] args) {
        File file = new File("demo.txt");
        FileOutputStream op;
        ObjectOutputStream objt;
        BufferedOutputStream beffer;
        //write file
//        try 
//        {
//            op = new FileOutputStream(file);
//            objt = new ObjectOutputStream(op);
//            objt.writeObject(new Person("Tran van Linh", "Hoa Binh"));
//            objt.writeObject(new Person("Tran van Linh2", "Hoa Binh"));
//            objt.writeObject(new Person("Tran van Linh3", "Hoa Binh"));
//            objt.writeObject(new Person("Tran van Linh4", "Hoa Binh"));
//            objt.writeObject(new Person("Tran van Linh5", "Hoa Binh"));
//            objt.writeObject(new Person("Tran van Linh6","Hoa Binh"));
//            objt.flush();
//            objt.close();
//            op.close();
//        }
//        catch (FileNotFoundException ex) {
//        } catch (IOException ex) {
//        } 
        
        //read file
        FileInputStream inp;
        ObjectInputStream obi;
        Person p;
        try {
            inp=new FileInputStream(file);
            obi=new ObjectInputStream(inp);
            while(inp.available()>0)
            {
                p=(Person)obi.readObject();
                System.out.println(p.getName()+" : "+p.getAddr());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Serialization_DEMO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Serialization_DEMO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
