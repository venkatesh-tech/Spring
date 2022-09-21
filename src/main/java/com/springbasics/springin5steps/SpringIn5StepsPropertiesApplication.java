package com.springbasics.springin5steps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.springbasics.springin5steps.properties.SomeExternalService;

@Configuration
@ComponentScan
//app.properties
@PropertySource("classpath:app.properties")
public class SpringIn5StepsPropertiesApplication {

	// What are the beans?
	// What are the dependencies of a bean?
	// What to search for beans? No need to do this because of the same package

	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringIn5StepsPropertiesApplication.class);

		SomeExternalService service = applicationContext.getBean(SomeExternalService.class);

		System.out.println(service.returnServiceURL());

		applicationContext.close();
	}

}
