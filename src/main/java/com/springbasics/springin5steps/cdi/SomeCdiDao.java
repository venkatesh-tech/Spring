package com.springbasics.springin5steps.cdi;

import javax.inject.Named;

//import org.springframework.stereotype.Component;

//@Component
@Named
public class SomeCdiDao {

	public int[] getData() {
		return new int[] { 5, 89, 100 };
	}
}
