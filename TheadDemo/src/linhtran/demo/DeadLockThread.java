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
public class DeadLockThread implements Runnable{

    @Override
    public void run() 
    {
        try {
            method1();
        } catch (InterruptedException ex) {
            Logger.getLogger(DeadLockThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    public synchronized void method1() throws InterruptedException
    {
        System.out.println("this is method 1");
        //Thread.sleep(1000);
        method2();
    }

    public void method2() throws InterruptedException
    {
         System.out.println("this is method 2");
         Thread.sleep(1000);
         method1();
    }
    
    public static void main(String[] args)
    {
        DeadLockThread dl=new DeadLockThread();
        Thread t1=new Thread(dl);
        Thread t2=new Thread(dl);
        
        t1.start();
        t2.start();
    }
}
