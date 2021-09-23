package com.rest.problemsApp;

import com.rest.problemsApp.model.Problem;
import com.rest.problemsApp.repository.ProblemRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProblemsAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProblemsAppApplication.class, args);
	}

}
