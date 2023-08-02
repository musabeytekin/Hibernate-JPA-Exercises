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
		};
	}
}
