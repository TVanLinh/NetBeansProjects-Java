/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryDesignPatterm;

/**
 *
 * @author Thanh Ha
 */
public class FactoryPatternDemo 
{
    public static void main(String[] args)
    {
        ShapeFactory shapFac=new ShapeFactory();
        
        Shape shape1 =shapFac.getShape("C");
        shape1.draw();
        
        Shape shape2 =shapFac.getShape("R");
        shape2.draw();
        
        Shape shape3 =shapFac.getShape("S");
        shape3.draw();
    }
}
