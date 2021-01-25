package com.github.kaczmarm.StudentOrganizer.controllers;


import com.github.kaczmarm.StudentOrganizer.entities.Student;
import com.github.kaczmarm.StudentOrganizer.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/students")
public class StudentController {

    private StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping(path = "/allStudents")
    public ResponseEntity<List<Student>> getAllStudents(){
        return ResponseEntity.status(HttpStatus.OK).body(service.findAllStudent());
    }

    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
        return ResponseEntity.status(HttpStatus.OK).body(service.createStudent(student));
    }

    @GetMapping(path = "/student/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable ("id") Long id){
        return ResponseEntity.status(HttpStatus.OK).body(service.getStudentById(id));
    }

    @DeleteMapping(path = "/student/{id}")
    public ResponseEntity<String> removeStudentById(@PathVariable ("id") Long id){
        return ResponseEntity.status(HttpStatus.OK).body(service.removeStudentById(id));
    }

}
