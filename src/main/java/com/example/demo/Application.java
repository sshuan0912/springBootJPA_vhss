package com.example.demo;

import com.example.demo.DAO.StudentRepository;
import com.example.demo.Entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }

//    @Bean
//    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
//        return args -> {
//            Student s1 = new Student(1,"Maria", "Jones","maria.jones@gmail.com",21);
//            Student s2 = new Student(2, "Leo", "Smith", "leo.smith@gmail.com", 25);
//            studentRepository.save(s1);
//            studentRepository.save(s2);
//        };
//    }

}
