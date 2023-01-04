package com.workshop.day11;

import java.util.Collections;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class Day11Application {

	private static final Logger logger = LoggerFactory.getLogger(Day11Application.class);
	private static String portNumber = null;
	private static final String DEFAULT_PORT = "8080";

	public static void main(String[] args) {
		// SpringApplication.run(Day11Application.class, args);
		for (String argVal : args) {
			logger.debug("argVal : " + argVal);
			if (argVal.contains("--port=")) {
				portNumber = argVal.substring(argVal.length() - 4, argVal.length());
				logger.debug("portNumber : " + portNumber);
			}
		}

		if (portNumber == null) {
			portNumber = System.getenv("APP_PORT");
			logger.debug("Sys ENV portNumber : " + portNumber);
		}

		if (portNumber == null) {
			portNumber = DEFAULT_PORT;
		}
		SpringApplication app = new SpringApplication(Day11Application.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", portNumber));
		app.run(args);
	}

}
