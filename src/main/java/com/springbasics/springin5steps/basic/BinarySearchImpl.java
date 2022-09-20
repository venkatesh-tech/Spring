package com.springbasics.springin5steps.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // creates the instances
//@Scope("prototype")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

//	private SortAlgorithm sortAlgorithm; //type 1 for autowiring
	// type 2 is using primary

	@Autowired // Instance is automatically created by spring itself
	@Qualifier("bubble")
	private SortAlgorithm sortAlgorithm;

//	Constructor Injection
//	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
//		super();
//		this.sortAlgorithm = sortAlgorithm;
//	}

	// Setter Injection
	public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}

	public int binarySearch(int[] numbers, int numberToSearchFor) {

		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		return 3;
	}

//	@PostConstruct
//	public void postConstruct() {
//		logger.info("postConstruct");
//	}
//
//	@PreDestroy
//	public void postDestroy() {
//		logger.info("postDestroy");
//	}
}
