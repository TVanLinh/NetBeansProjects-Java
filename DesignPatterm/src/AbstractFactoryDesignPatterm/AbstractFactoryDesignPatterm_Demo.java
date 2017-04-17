/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryDesignPatterm;

/**
 *
 * @author Thanh Ha
 */
public class AbstractFactoryDesignPatterm_Demo {
    public static void main(String args[])
    {
        FactoryProducer fp=new FactoryProducer();
        AbstractFactory afshape=fp.getFactory("ShapeFactory");
        Shape shape1=afshape.getShape("Circle");
        shape1.draw();
        
         AbstractFactory afcolor=fp.getFactory("ColorFactory");
         afcolor.getColor("B").fill();
    }
}
