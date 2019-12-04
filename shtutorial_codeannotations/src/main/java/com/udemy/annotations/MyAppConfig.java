package com.udemy.annotations;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.udemy.annotations")
@PropertySource("classpath:springlog.properties")
public class MyAppConfig {

	// @Value("${root.logger.level}")
	private String rootLoggerLevel;
	
	// @Value("${printed.logger.level}")
	private String printedLoggerLevel;
	
	// @PostConstruct
	public void configSpringLogger()
	{
		Level rootLevel = Level.parse(rootLoggerLevel);
		Level consoleLevel = Level.parse(printedLoggerLevel);
		
		
		// get logger for app context
		Logger applicationContextLogger = Logger.getLogger(AnnotationConfigApplicationContext.class.getName());
		// get parent logger
		Logger loggerParent = applicationContextLogger.getParent();
		 
		loggerParent.setLevel(rootLevel);
		
		ConsoleHandler consoleHandler = new ConsoleHandler();
		consoleHandler.setLevel(consoleLevel);
		consoleHandler.setFormatter(new SimpleFormatter());
		
		// add handler to the logger
		loggerParent.addHandler(consoleHandler);		
		
	}
	
	
	
}
