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
    @Override
    public List<Student> selectAllStudents() {
        
        return DB;
    }
    @Override
    public Student getStudentByID(String id) {
        for(int i=0; i<DB.size(); i++)
        {
            if(id.equals(DB.get(i).getCMSID()))
            {
                return DB.get(i);
            }
        }
        return null;
    }
    @Override
    public boolean deleteStudentByID(String id) {
        for(int i=0; i<DB.size(); i++)
        {
            if(id.equals(DB.get(i).getCMSID()))
            {
                DB.remove(i);
                return true;
            }
        }
        
        return false;
    }
    @Override
    public Student updateStudentByID(String id, Student student) {
        for(int i=0; i<DB.size(); i++)
        {
            if(id.equals(DB.get(i).getCMSID()))
            {
                DB.remove(i);
                DB.add(i, student);
                return DB.get(i);
            }
        }
        return null;
    }
   
   
    
    
}
