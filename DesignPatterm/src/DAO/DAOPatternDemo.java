/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author Thanh Ha
 */
public class DAOPatternDemo
{
    public static void main(String []args)
    {
        StudentDAO studentDAO=new StudentDAOImplement();
        
        Student student=new Student();
        student.setName("Tran Van Linh");
        student.setRollNo(0);
        studentDAO.addStudent(student);
        
        Student student2=new Student();
        student2.setName("Tran Van Linh ");
        student2.setRollNo(1);
        studentDAO.addStudent(student2);
         
        Student student3=new Student();
        student3.setName("Tran Van Linh ");
        student3.setRollNo(2);
        studentDAO.addStudent(student3);
        
        for(Student i:studentDAO.getAllStudent())
        {
            System.out.println(i.getName()+"  "+i.getRollNo());
        }
    }
}
