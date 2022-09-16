package com.example.controller;

import com.example.demo.xyz.Students;
import com.example.service.StudentDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentDetails studentDetails;
    @GetMapping("/students")
    private List<Students> getAllStudents()
    {
    return studentDetails.getAllStudents();
    }
    @GetMapping("/students/{roll}")
    private Students getStudents(@PathVariable("roll") int roll)
    {
        return studentDetails.getStudentsById(roll);
    }
    @DeleteMapping("/students/{roll}")
    private void deleteStudents(@PathVariable("roll") int roll)
    {
        studentDetails.delete(roll);
    }
    @PostMapping("/students")
    private int saveStudents(@RequestBody Students students)
    {
        studentDetails.saveOrUpdate(students);
        return students.getRoll();
    }
    @PutMapping
    private Students update(@RequestBody Students students)
    {
        studentDetails.saveOrUpdate(students);
        return students;
    }
}
