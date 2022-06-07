package com.golden.swhb.service;

import com.golden.swhb.dao.Database;
import com.golden.swhb.model.Student;

public class StudentService {
    
    private Database database;

    public StudentService(Database database)
    {
         this.database=database;
    }

    public boolean addNewStudent(Student newStudent)
    {
        return this.database.insertStudent(newStudent);
    }
}
