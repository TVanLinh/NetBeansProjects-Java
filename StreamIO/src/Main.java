
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thanh Ha
 */
public class Main {
    public static void main(String[] args)
    {
        String filename="demo.txt";
        
//        writeFileOutPutStream(filename);
//        readFileInputStream(filename);
//        writeFileBufferedOutputStream(filename);
        //readFileBufferedInputStream(filename);
        
        
        String filename2="datastream.txt";
        writeFileDataOutputStream(filename2);
        readFileDataInputStream(filename2);
    }
    
    public static void writeFileOutPutStream(String filename)
    {
        File file=new File( filename);
         OutputStream outp;
        if(!file.exists())
        {
            try {
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            outp=new FileOutputStream(file);
            byte []bytes=new byte[100];
            String str="Hello word";
            bytes=str.getBytes();
            outp.write(bytes);
            outp.flush();
            outp.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void readFileInputStream(String filename)
    {
        File file=new File(filename);
        System.out.println(file.length());
        InputStream outp;
        if(!file.exists())
        {
            try {
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        try {
            outp=new FileInputStream(file);
            int a;
            int len=(int) file.length();
            byte[] byt=new byte[len];
//            while((a=outp.read())!=-1)
//            {
//               System.out.println(String.valueOf(a));
//            }
            outp.read(byt);
            char c=(char)byt[0];
            System.out.println(c);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static  void writeFileBufferedOutputStream(String fileName)
    {
        File file=new File(fileName);
        //System.out.println(file.length());
        OutputStream outp;
        BufferedOutputStream bfs;
        if(!file.exists())
        {
            try {
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        try {
            outp=new FileOutputStream(file,true);
            bfs=new BufferedOutputStream(outp);
            String str=" Hello i'm BufferedInputStream";
            bfs.write(str.getBytes());
            bfs.flush();
            bfs.close();
            outp.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }finally
        {
            System.out.println("\nWrite file succesfully!");
        }
    }
    
    
    public static void readFileBufferedInputStream(String fileName)
    {
        
        File file=new File(fileName);
        InputStream inp;
        BufferedInputStream bfs;
        if(!file.exists())
        {
            try {
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            inp = new FileInputStream(file);
            bfs=new BufferedInputStream(inp);
            int bit;
            while((bit=bfs.read())!=-1)
            {
                System.out.print((char)bit);
            }
            bfs.close();
            inp.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void writeFileDataOutputStream(String fileName)
    {
        File file=new File(fileName);
       
        OutputStream outp;
        DataOutputStream douts;
        if(!file.exists())
        {
            try {
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        try {
            outp=new FileOutputStream(file);
            douts=new DataOutputStream(outp);
            douts.writeInt(11112);
            douts.writeUTF("Tran Van Linh");
            douts.flush();
            douts.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }finally
        {
             System.out.println("\nWrite file succesfully! : path absolute "+ file.getAbsolutePath());
             System.out.println("\npath relative "+file.getPath());
        }
        
    }
    
     public static void readFileDataInputStream(String fileName)
    {
        File file=new File(fileName);
        InputStream inps;
        DataInputStream dinps;
        if(!file.exists())
        {
            try {
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        try {
            inps=new FileInputStream(file);
            dinps=new DataInputStream(inps);
            System.out.println(dinps.readInt());
            System.out.println(dinps.readUTF());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }finally
        {
             System.out.println("\nRead file succesfully!");
        }
        
    }
}
