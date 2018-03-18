package com.sumit.elastic.elastic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.sumit.elastic")

public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
