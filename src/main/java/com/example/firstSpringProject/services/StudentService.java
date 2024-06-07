package com.example.firstSpringProject.services;

import com.example.firstSpringProject.model.Student;
import java.util.List;
import java.util.Optional;

public interface StudentService {
    Student createStudent(Student student);
    List<Student> getAllStudents();
    Optional<Student> getStudentById(Long studentId);
    Student updateStudent(Long studentId, Student studentDetails);
    void deleteStudent(Long studentId);
}
