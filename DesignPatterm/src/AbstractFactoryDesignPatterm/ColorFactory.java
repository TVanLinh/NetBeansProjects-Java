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
public class ColorFactory extends AbstractFactory{

     @Override
    public Color getColor(String name) 
    {
        char color=name.charAt(0);
        switch(color)
        {
            case 'R':
            {
                return new Red();
            }
            case 'G':
            {
                return new Green();
            }
             case 'B':
            {
                return new Blue();
            }
             default:
                 return null;
        }
    }
    
    @Override
    public Shape getShape(String name)
    {
        return null;
    }
}
