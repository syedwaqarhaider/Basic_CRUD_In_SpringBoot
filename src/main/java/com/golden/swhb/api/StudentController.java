package com.golden.swhb.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.golden.swhb.model.Student;
import com.golden.swhb.service.StudentService;
@RequestMapping("api/student")
@RestController
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    //End-Points
    
    @PostMapping
    public boolean addNewStudent(@RequestBody Student newStudent)
    {
        return this.studentService.addNewStudent(newStudent);
    }
    
    
}
