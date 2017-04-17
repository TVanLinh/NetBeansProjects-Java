/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Thanh Ha
 */
public class StudentDAOImplement implements StudentDAO{
    List<Student> students;
    
    public StudentDAOImplement()
    {
        students=new LinkedList<Student>();
    }
    @Override
    public List<Student> getAllStudent() 
    {
        return students;
    }

    @Override
    public void updateStudents(Student student) 
    {
        students.get(student.getRollNo()).setName(student.getName());
    }

    @Override
    public void deleteStudent(int index)
    {
        students.remove(index);
    }

    @Override
    public void addStudent(Student student) 
    {
        students.add(student);
    }
    
}
