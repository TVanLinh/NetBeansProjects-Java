/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linhtran.demo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Thanh Ha
 */
public class MyTheadRunable implements Runnable {
    int sumMonney=1000;
    @Override
    public void run() {
      rutTien();
    }
    
    public synchronized void rutTien()
    {
        if(this.sumMonney>0)
       {
           try {
               Thread.sleep(1000);
               this.sumMonney -= 1000;
           } catch (InterruptedException ex) {
                Logger.getLogger(MyTheadRunable.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
       System.out.println(this.sumMonney);
    }
    public static void main(String[] args) throws InterruptedException
    { 
        MyTheadRunable t=new MyTheadRunable();
        
        Thread t1=new Thread(t);
        Thread t2=new Thread(t);
        t1.start();
        t1.join();
        t2.start();
    }
}
