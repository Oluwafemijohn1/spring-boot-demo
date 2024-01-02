package com.ephemzy.springbootdemo;

import com.ephemzy.springbootdemo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
public class SpringBootDemoApplication {

	/**
	 * We want to structure our app in this structure
	 * 1. API layer
	 * 2. Service layer
	 * 3. Data Access layer
	 *
	 * */
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

}
