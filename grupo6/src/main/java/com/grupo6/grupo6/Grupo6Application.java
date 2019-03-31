package com.grupo6.grupo6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@ComponentScan({"Control"})
public class Grupo6Application {

	public static void main(String[] args) {
		SpringApplication.run(Grupo6Application.class, args);
	}

}
