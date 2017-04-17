/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingletonDesignPattern;

public class Person {
    private static Person instance;// 1
    
    private Person()//2
    {
        //do your something....
    }
    
    public static Person getInstance()//3
    {
        if(instance==null)
        {
            return (instance=new Person());
        }
        return instance;
    }
    
    public void show()
    {
        System.out.println("This is class Person with singleton desing patterm");
    }
}
