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
public class ShapeFactory {
    public Shape getShape(String shapeType) 
    {
        if (shapeType == null)
        {
            return null;
        }
        if (shapeType.equalsIgnoreCase("C"))
        {
            return new Circle();
        }else if (shapeType.equalsIgnoreCase("R")) 
        {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("S"))
        {
            return new Square();
        }
        return null;
    }
}
