/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linhtran.demo;

/**
 *
 * @author Thanh Ha
 */
public class Main {
    public static void main(String[] args) throws InterruptedException
    {
        MyThread t1=new MyThread("t1");
        MyThread t2=new MyThread("t2");
        t1.start();
        
        t1.join();
        t2.start();
         t2.join();
       
    }
}
