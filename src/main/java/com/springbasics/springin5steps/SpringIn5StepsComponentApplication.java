package com.springbasics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.springbasics.componentScan.ComponentDAO;

@Configuration
@ComponentScan("com.springbasics.componentScan") // Define this when you are not working on the same package so that
													// spring will scan these packages also
public class SpringIn5StepsComponentApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsComponentApplication.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringIn5StepsComponentApplication.class);

		ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);

		LOGGER.info("{}", componentDAO);

	}

}
