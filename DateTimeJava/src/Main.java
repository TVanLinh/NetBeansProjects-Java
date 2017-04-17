
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

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
        Calendar cal= GregorianCalendar.getInstance();;
        System.out.println(cal.getTime().toString());
        DateFormat df=new SimpleDateFormat("hh:mm:ss dd:MM:yyyy");
        Date date=cal.getTime();
        System.out.println(df.format(date));
        System.out.print(cal.get(Calendar.YEAR)+" : ");
        System.out.print(cal.get(Calendar.MONTH)+1+" : ");
        System.out.print(cal.get(Calendar.DATE)+" : ");
        System.out.print(cal.get(Calendar.HOUR)+" : ");
        System.out.print(cal.get(Calendar.MINUTE)+" : ");
        System.out.println(cal.get(Calendar.SECOND));
        System.out.println("AM : " + cal.get(Calendar.AM_PM));
       
    } 
  
}
