/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryDesignPatterm;

public class FactoryProducer {
    public AbstractFactory getFactory(String name)
    {
        if(name.equalsIgnoreCase("shapefactory"))
        {
            return new ShapeFactory();
        }else if(name.equalsIgnoreCase("colorfactory"))
        {
            return new ColorFactory();
        }
        return null;
    }
}
