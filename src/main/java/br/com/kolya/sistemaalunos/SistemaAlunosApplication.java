package br.com.kolya.sistemaalunos;

import br.com.kolya.sistemaalunos.entity.Student;
import br.com.kolya.sistemaalunos.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SistemaAlunosApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SistemaAlunosApplication.class, args);
    }

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
        /*
        Student student1 = new Student("Nico", "Padalko", "nico.@mail.com");
        studentRepository.save(student1);

        Student student2 = new Student("Zeco", "Malu", "ze.@mail.com");
        studentRepository.save(student2);

        Student student3 = new Student("Mario", "Jaca", "ma.@mail.com");
        studentRepository.save(student3);


         */
    }

}
