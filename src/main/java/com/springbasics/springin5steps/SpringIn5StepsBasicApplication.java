package com.springbasics.springin5steps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.springbasics.springin5steps.basic.BinarySearchImpl;

@Configuration
@ComponentScan
public class SpringIn5StepsBasicApplication {

	// What are the beans?
	// What are the dependencies of a bean?
	// What to search for beans? No need to do this because of the same package

	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringIn5StepsBasicApplication.class);

		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);

		BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);

		System.out.println(binarySearch);
		System.out.println(binarySearch1);

		int result = binarySearch.binarySearch(new int[] { 10, 5, 2 }, 2);
		System.out.println(result);

		applicationContext.close();
	}

}
