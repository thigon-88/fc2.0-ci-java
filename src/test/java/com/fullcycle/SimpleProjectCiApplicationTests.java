package com.fullcycle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SimpleProjectCiApplicationTests {
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void shouldTestSumTwoNumbers() {
		int sum = MathOperations.sum(15, 15);
		Assertions.assertEquals(sum, 30, String.format("Invalid result. It was expected %d, but it the sum result was %d", 30, sum));
	}

}
