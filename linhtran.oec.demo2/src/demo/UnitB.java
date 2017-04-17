/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import demo.UnitB.InnerClass;

/**
 *
 * @author Thanh Ha
 */
public  class UnitB implements MyInterface{
    @Override
    public void display()
    {
        System.out.println("this is B");
    }
    
    public  class InnerClass
    {
      
        int a=10;
        public void show()
        {
            System.out.println(a);
        }
    }
    public  static class InnerClass2
    {
      
        int a=10;
        public void show()
        {
            System.out.println(a);
        }
    }
    public static void main(String[] args)
    {
        MyInterface a=new UnitA(); 
        MyInterface b=new UnitB();
        a.display();
        b.display();
        UnitB c=new UnitB();
        UnitB.InnerClass d =c.new InnerClass();
        UnitB.InnerClass2 e=  new UnitB.InnerClass2();
    }
}