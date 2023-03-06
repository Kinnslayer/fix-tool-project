package com.rodrigo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.rodrigo")
@SpringBootApplication
public class FixToolSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(FixToolSpringApplication.class, args);
	}

}
