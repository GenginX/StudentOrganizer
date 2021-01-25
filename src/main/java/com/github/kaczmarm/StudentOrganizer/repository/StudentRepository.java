package com.github.kaczmarm.StudentOrganizer.repository;

import com.github.kaczmarm.StudentOrganizer.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
