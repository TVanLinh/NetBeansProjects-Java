/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumdemo;

import enumdemo.EnumDemo.DAY;

/**
 *
 * @author Thanh Ha
 */
public class Main {
     public static void main(String[] args) 
    {
        EnumDemo test = new EnumDemo();
        System.out.println(EnumDemo.Month.ONE);
        for (DAY day : EnumDemo.DAY.values()) {
            System.out.print(day.value);
        }
        System.out.println("\n" + EnumDemo.DAY.MONDAY);
        System.out.println(EnumDemo.DAY.MONDAY.value);
        System.out.println("\n" + EnumDemo.DAY.MONDAY);
        System.out.println("\noperator: " + (EnumDemo.DAY.MONDAY.value==EnumDemo.DAY.TUESDAY.value));
        System.out.println(TEST.test1);
    }
}
