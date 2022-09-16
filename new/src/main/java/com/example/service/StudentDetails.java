package com.example.service;

import com.example.repository.StudentsRepository;
import com.example.demo.xyz.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class StudentDetails {
    @Autowired
    StudentsRepository studentsRepository;

    public List<Students> getAllStudents()
    {
        List <Students> students= new ArrayList<Students>();
        studentsRepository.findAll().forEach(students1-> students.add(students1));
        return students;
    }
    public Students getStudentsById(int roll)
    {
        return studentsRepository.findById(roll).get();
    }
    public void saveOrUpdate(Students students)
    {
        studentsRepository.save(students);
    }

    public void delete(int roll) {
        studentsRepository.deleteById(roll);
    }

    public void update(Students students, int roll) {
        studentsRepository.save(students);
    }
}
