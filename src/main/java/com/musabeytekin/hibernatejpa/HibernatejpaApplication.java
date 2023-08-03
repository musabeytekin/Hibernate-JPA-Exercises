package com.musabeytekin.hibernatejpa;

import com.musabeytekin.hibernatejpa.dao.StudentDAO;
import com.musabeytekin.hibernatejpa.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class HibernatejpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(HibernatejpaApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
        return runner -> {

            removeStudent(studentDAO);

        };
    }

    private void removeStudent(StudentDAO studentDAO) {
        studentDAO.delete(2);
    }

    private void updateStudent(StudentDAO studentDAO) {
        Student student = studentDAO.findById(1);
        student.setEmail("updated 2");
        studentDAO.update(student);
    }

    private void queryForStudents(StudentDAO studentDAO) {
        List<Student> students = studentDAO.findAll();

        for (Student student : students) {
            System.out.println(student);
        }
    }
    private void readStudent(StudentDAO studentDAO) {
        System.out.println("Reading student...");
        Student student = studentDAO.findById(1);
        System.out.println("Student: " + student);
    }
    private void createStudent(StudentDAO studentDAO) {
        System.out.println("Creating student...");
        Student student1 = new Student("Recep Tayyip", "Erdogan", "rterdogan@mail.com.tr");
        Student student2 = new Student("Kemal", "Kilicdaroglu", "kkilicdaroglu@mail.com.tr");

        System.out.println("Saving student...");
        studentDAO.save(student1);
        studentDAO.save(student2);
    }
}