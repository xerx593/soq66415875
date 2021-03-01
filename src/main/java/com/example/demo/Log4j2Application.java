package com.example.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Log4j2Application {
	private static final Logger logger = LogManager.getLogger("Log4j2Application");

	public static void main(String[] args) {
        logger.trace("A TRACE Message");
        logger.debug("A DEBUG Message");
        logger.info("An INFO Message");
        logger.warn("A WARN Message");
        logger.error("An ERROR Message");
        logger.error("Error Message Logged !!!", new NullPointerException("NullError"));
		SpringApplication.run(Log4j2Application.class, args);
	}

}
