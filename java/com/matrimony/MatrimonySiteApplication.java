package com.matrimony;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MatrimonySiteApplication {

	private static final Logger logger = LoggerFactory.getLogger(MatrimonySiteApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(MatrimonySiteApplication.class, args);
		logger.info("Inside Main:-->");
	}

}
