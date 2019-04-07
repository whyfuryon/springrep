package com.home.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.home.task.*")
public class HometaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(HometaskApplication.class, args);
	}

}
