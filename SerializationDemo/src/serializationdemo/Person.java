/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializationdemo;

import java.io.Serializable;

/**
 *
 * @author Thanh Ha
 */
public class Person implements Serializable {

    private String name;
    private String addr;

    public Person() {
    }

    public Person(String name, String addr) {
        this.name = name;
        this.addr = addr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
    
    @Override
    public String toString()
    {
        return "name: "+name+"\n"+"address: "+addr;
    }
    
}
