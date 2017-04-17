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
public abstract class AbstractFactory {
    public abstract Shape getShape(String name);
    public abstract Color getColor(String name);
}
