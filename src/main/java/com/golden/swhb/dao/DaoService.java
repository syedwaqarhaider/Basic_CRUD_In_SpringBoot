package com.golden.swhb.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.golden.swhb.model.Student;
@Repository("StudentDB")
public class DaoService implements Database {
      
     private List<Student> DB= new ArrayList<>();
    @Override
    public boolean insertStudent(Student student) {
        DB.add(student);
        return true;
    }
    
    
}
