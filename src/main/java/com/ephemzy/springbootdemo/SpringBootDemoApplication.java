package com.ephemzy.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDemoApplication {

	/**
	 * We want to structure our app in this structure
	 * 1. API layer
	 * 2. Service layer
	 * 3. Data Access layer
	 *
	 * <p>
	 * java -jar spring-boot-demo-0.0.1-SNAPSHOT.jar
	 *
	 *
	 * <p>
	 *     Running the app on a different port
	 * java -jar spring-boot-demo-0.0.1-SNAPSHOT.jar --server.port=8083
	 *
	 *
	 * */
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

}
