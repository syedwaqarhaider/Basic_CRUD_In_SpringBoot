package com.golden.swhb.dao;

import java.util.List;

import com.golden.swhb.model.Student;

public interface Database {
    public boolean insertStudent(Student student);

    public List<Student> selectAllStudents();

    public Student getStudentByID(String id);
    public boolean deleteStudentByID(String id);
    public Student updateStudentByID(String id, Student student);
    
    
}
