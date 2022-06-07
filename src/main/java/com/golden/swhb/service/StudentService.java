package com.golden.swhb.service;

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
}
