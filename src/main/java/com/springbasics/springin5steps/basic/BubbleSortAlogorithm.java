package com.springbasics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component // Creates Instance of this particular class
//@Primary
@Qualifier("bubble")
public class BubbleSortAlogorithm implements SortAlgorithm {
	public int[] sort(int[] numbers) {
		return numbers;
	}
}
