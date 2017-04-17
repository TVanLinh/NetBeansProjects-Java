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
public class MyThread extends Thread{
    public String name;

    public MyThread(String name) {
        this.name = name;
    }
    @Override
    public void run()
    {
        for(int i=0;i<4;i++)
        {
            System.out.println(this.getName()+"  "+i);
        }
    }
}
