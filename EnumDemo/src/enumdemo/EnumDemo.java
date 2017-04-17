/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumdemo;

/**
 *
 * @author Thanh Ha
 */
enum TEST{test1,test2,test3}
public class EnumDemo {
    enum Month {ONE,TWO,THREE}
    enum DAY
    {
        MONDAY(5),TUESDAY(5),WENESDAY(4),THURDAY(2),FRIDAY(3);
        int value;
        DAY(int value)
        {
            this.value=value;
        }
    }
}
