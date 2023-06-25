package com.example.springboot.spjdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("Component")
public class SpjdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpjdbcApplication.class, args);
	}

}
