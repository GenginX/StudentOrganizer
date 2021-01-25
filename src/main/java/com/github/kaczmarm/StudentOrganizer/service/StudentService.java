package com.github.kaczmarm.StudentOrganizer.service;

import com.github.kaczmarm.StudentOrganizer.entities.Student;
import com.github.kaczmarm.StudentOrganizer.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public Student createStudent(Student student){
        repository.save(student);
        return student;
    }

    public List<Student> findAllStudent(){
        return repository.findAll();
    }

}
