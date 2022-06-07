package com.golden.swhb.dao;

import java.util.ArrayList;
import java.util.List;

import com.golden.swhb.model.Student;

public class DaoService implements Database {
      
     private List<Student> DB= new ArrayList<>();
    @Override
    public boolean insertStudent(Student student) {
        DB.add(student);
        return true;
    }
    
    
}
