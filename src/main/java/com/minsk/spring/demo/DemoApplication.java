package com.minsk.spring.demo;

import com.minsk.spring.demo.rabbit.RabbitAmqpTutorialsApplication;
import com.minsk.spring.demo.rabbit.RabbitAmqpTutorialsRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	private static String[] args_ = new String[0];

	private static CommandLineRunner commandLineRunner;


	public DemoApplication() throws Exception {
        RabbitAmqpTutorialsApplication rc = new RabbitAmqpTutorialsApplication();
		commandLineRunner = rc.tutorial();
		commandLineRunner.run(args_);
	}

	public static void main(String[] args) {
	    args_ = args;
		SpringApplication.run(DemoApplication.class, args);
	}
}
