package com.musabeytekin.hibernatejpa;

import com.musabeytekin.hibernatejpa.dao.StudentDAO;
import com.musabeytekin.hibernatejpa.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HibernatejpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernatejpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			createStudent(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO) {
		System.out.println("Creating student...");
		Student student = new Student("Recep Tayyip", "Erdogan", "rterdogan@mail.com.tr");
		System.out.println("Saving student...");
		studentDAO.save(student);

		System.out.println("Student saved! Generated id: " + student.getId());

	}
}
