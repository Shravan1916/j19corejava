package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProjectCustomerManagement1ApplicationTests {
	
	private Calculator calculator=new Calculator();

	@Test
	void contextLoads() {
	}
	
	@Test
	void testSum()
	{
		int expectedResult=9;
		int actualResult=calculator.doSum(2,3,4);
		
		assertThat(actualResult).isEqualTo(expectedResult);
	}
	
	@Test
	void testCompareNums()
	{
		Boolean actualResult=calculator.compareTwoNums(4, 3);
		assertThat(actualResult).isTrue();
	}

}
