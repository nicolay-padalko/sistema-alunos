package br.com.kolya.sistemaalunos.service;

import br.com.kolya.sistemaalunos.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentById(Long id);
    Student updateStudent(Student student);

    Student deleteStudentById(Long id);
}
