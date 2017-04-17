/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thanh Ha
 */
public class B  extends A{
    public int a=5;
    public void show()
    {
        System.out.println("this is B");
    }
   public void method2()
   {
         System.out.println("this is method 2 of B");
   }
    public static void main(String[] args)
    {
        B b=new B();
        A c=new B();
     
        b.show();
   
        System.out.println( b.a);
        System.out.println(b==c);
        System.out.println(b instanceof A);
        System.out.println(b instanceof B);
        A d=(A)b;
        d.show();
        System.out.println( d.a);
        b.method2();
    }
}
