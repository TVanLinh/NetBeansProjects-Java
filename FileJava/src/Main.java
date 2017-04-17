
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStream;
        

public class Main {
    public static void main(String [] args)
    {
//        wireFile("demo.txt");
//        readFile("demo.txt");
//        creatDirectery("test.txt","testdirectory");
//        renameTo("testdirectory","moidoitennhe");
//        renameTo("moidoitennhe","moidoitennhe-version2");
       // renameTo("demo.txt","demo_rename.txt");
        
//        File file=new File("demo.txt");
//        File fileNameNew=new File("demorename.txt");
//        file.renameTo(fileNameNew);
        
        //renameTo("demorename.txt","demo_rename.txt");
        
        
       
         File file=new File("b/c/d/e");
         file.mkdirs();
        
        
    }
    public static void wireFile(String nameFile)
    {
        try {
            File file=new File(nameFile);
            System.out.println(file.createNewFile());
            //System.out.println(file.delete());
            FileWriter fw=new FileWriter(file,false);
            BufferedWriter bw=new BufferedWriter(fw);
            bw.write("Hello java1\t");
            bw.newLine();
            bw.write("\nHello java2\t");
            bw.newLine();
            bw.write("\nHello java3\t");
            bw.newLine();
            bw.write("\nHello java4");
            bw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void readFile(String nameFile)
    {
        File file=new File(nameFile);
        try {
            FileReader fr=new FileReader(file);
            BufferedReader bw=new BufferedReader(fr);
            StringBuilder str=new StringBuilder();
            String s;
            while((s=bw.readLine())!=null)
            {
                str.append(s);
            }
            System.out.println(str.toString());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void creatDirectery(String nameFile,String dir)
    {
        File file=new File(dir);
        File file2;
        if(!file.exists())
        {
            file.mkdir();
            file2=new File(file,nameFile);
            try {
                file2.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    public static void renameTo(String nameOld,String nameNew)
    {
        File file=new File(nameOld);
        File fileNew=new File(nameNew);
        if(file.exists())
        {
            file.renameTo(fileNew);
        }
    }
}
