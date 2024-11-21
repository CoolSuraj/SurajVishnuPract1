package com.suraj.vishnu.Todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * Start Of the Program
 * 1. Configuration, EnableAutoCOnfiguration ,ComponentScan
 */
@SpringBootApplication
public class TodoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
		System.out.println("Test");
	}

}
