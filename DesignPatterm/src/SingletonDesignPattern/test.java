/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingletonDesignPattern;

/**
 *
 * @author Thanh Ha
 */
public class test {
    public static void main(String[] args)
    {
        Person p=Person.getInstance();
        p.show();
    }
}
