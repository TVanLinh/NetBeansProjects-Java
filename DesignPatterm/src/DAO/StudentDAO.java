/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;

/**
 *
 * @author Thanh Ha
 */
public interface StudentDAO 
{
    List<Student> getAllStudent();
    void updateStudents(Student student);
    void deleteStudent(int index);
    void addStudent(Student student);
}
