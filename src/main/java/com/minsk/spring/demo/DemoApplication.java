package com.minsk.spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DemoApplication {

	public DemoApplication() throws Exception {
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
