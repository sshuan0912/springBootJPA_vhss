package com.example.demo.Controller;

import com.example.demo.Entity.Student;
import com.example.demo.Service.CourseEnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class CourseEnrollmentController {

    @Autowired
    private final CourseEnrollmentService courseEnrollmentService;

    public CourseEnrollmentController(CourseEnrollmentService courseEnrollmentService) {
        this.courseEnrollmentService = courseEnrollmentService;
    }

    @GetMapping("/get")
    public List<Student> getAllstudents(){
        return courseEnrollmentService.getAllstudents();
    }

    @GetMapping("/get/{studentId}")
    public Student getStudentById(@PathVariable Integer studentId){
        return courseEnrollmentService.getStudentById(studentId);
    }

    @PostMapping("/post")
    public Student postStudent(@RequestBody Student s){
        return courseEnrollmentService.saveStudent(s);
    }

    @PutMapping("/put")
    public Student putStudent(@RequestBody Student s){
        return courseEnrollmentService.updateStudent(s);
    }

    @DeleteMapping("/delete/{studentId}")
    public Integer deleteStudent(@PathVariable Integer studentId){
        return courseEnrollmentService.deleteStudent(studentId);
    }

}
