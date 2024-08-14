package com.student.management.service;

import com.student.management.entity.Student;
import com.student.management.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl {

    @Autowired
    StudentRepo studentRepo;

    public List<Student> getAllStudents(){
        return studentRepo.findAll();
    }

    public Student saveStudent(Student student){
        return studentRepo.saveAndFlush(student);
    }
}
