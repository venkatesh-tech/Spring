package com.springbasics.springin5steps.basic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.springbasics.springin5steps.SpringIn5StepsBasicApplication;

//Load the context
@RunWith(SpringRunner.class) // Loads the configuration step 2
@ContextConfiguration(classes = SpringIn5StepsBasicApplication.class) // specifies the configuration step 1
public class BinarySearchTest {

	// Get this bean from the context
	@Autowired
	BinarySearchImpl binarySearch;

	@Test
	public void testBasicScenario() {
		// Call method on binarySearch
		int actualresult = binarySearch.binarySearch(new int[] {}, 5);

		// check if the value is correct
		assertEquals(actualresult, 3);
	}

}
