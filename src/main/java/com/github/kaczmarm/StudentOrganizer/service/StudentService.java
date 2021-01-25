package com.github.kaczmarm.StudentOrganizer.service;

import com.github.kaczmarm.StudentOrganizer.entities.Student;
import com.github.kaczmarm.StudentOrganizer.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Student getStudentById(Long id){
        Optional<Student> studentOptional = repository.findById(id);
        return studentOptional.orElse(null);
    }

    public String removeStudentById(Long id){
        repository.deleteById(id);
        return "Student with id: " + id + " removed successfully";
    }

}
