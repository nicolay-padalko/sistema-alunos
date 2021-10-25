package br.com.kolya.sistemaalunos.repository;

import br.com.kolya.sistemaalunos.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student, Long> {
}
