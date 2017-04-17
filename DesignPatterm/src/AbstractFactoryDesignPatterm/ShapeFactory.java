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
public class ShapeFactory extends AbstractFactory{

    @Override
    public Shape getShape(String name)
    {
        char shape=name.charAt(0);
        switch (shape) {
            case 'S':
                return new Square();
            case 'R':
                return new Rectangle();
            case 'C':
                return new Circle();
            default:
                return null;
        }
    }

    @Override
    public Color getColor(String name) 
    {
        return null;
    }
    
}
