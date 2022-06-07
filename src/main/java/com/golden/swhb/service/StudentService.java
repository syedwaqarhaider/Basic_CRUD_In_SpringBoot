package com.golden.swhb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.golden.swhb.dao.Database;
import com.golden.swhb.model.Student;
@Service
public class StudentService {
    
    private Database database;

    @Autowired
    public StudentService(@Qualifier("StudentDB") Database database)
    {
         this.database=database;
    }

    public boolean addNewStudent(Student newStudent)
    {
        return this.database.insertStudent(newStudent);
    }

    public List<Student> getAllStudent() {
        return this.database.selectAllStudents();
    }

    public Student getStudentbyID(String id)
    {
        return this.database.getStudentByID(id);
    }

    public boolean deleteStudentbyID(String id)
    {
        return this.database.deleteStudentByID(id);
    }
    public Student updateStudentByID(String id, Student student){
        return this.database.updateStudentByID(id, student);
    }
}
