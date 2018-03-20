package com.broadways.swingdemo.services;

import java.util.List;

import com.broadways.swingdemo.models.Student;

public interface StudentService {
    public boolean addStudent(Student s);
    public List <Student> getAddStudent();
    public boolean deleteStudent(int id);
    public boolean updateStudent(Student s);
    public Student getById(int id);
}
