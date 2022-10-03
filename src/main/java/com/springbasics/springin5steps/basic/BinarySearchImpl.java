package com.springbasics.springin5steps.basic;

import org.slf4j.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // creates the instances
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired // Instance is automatically created by spring itself
	@Qualifier("bubble")
	private SortAlgorithm sortAlgorithm;

	public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}

	public int binarySearch(int[] numbers, int numberToSearchFor) {

		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		return 3;
	}

}
