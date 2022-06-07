package com.golden.swhb.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
    
    @GetMapping
    public List<Student> getAllStudent()
    {
        return this.studentService.getAllStudent();
    }


    @GetMapping(path="{id}")
    public Student getStudentbyID(@PathVariable("id") String id)
    {
        return this.studentService.getStudentbyID(id);
    }
     
    @DeleteMapping(path="/delete/{id}")
    public boolean deleteStudentbyID(@PathVariable("id") String id)
    {
        return this.studentService.deleteStudentbyID(id);
    }

    @PutMapping(path = "/update/{id}")
    public Student updateStudentByID(@PathVariable("id") String id,@RequestBody Student student){
        return this.studentService.updateStudentByID(id, student);
    }
 
    


}
