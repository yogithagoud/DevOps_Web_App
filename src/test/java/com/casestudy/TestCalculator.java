package com.casestudy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class TestCalculator {
	@Test
	public void testSum() {
		int a =10;
		int b =20;
		int sum = a+b;
		Calculator calc = new Calculator();
		int actualSum = calc.sum(a, b);
		Assertions.assertEquals(sum, actualSum);
	}
	
	@Test
	public void testSub() {
		int a =20;
		int b =10;
		int sub = a-b;
		Calculator calc = new Calculator();
		int actualSub = calc.sub(a, b);
		Assertions.assertEquals(sub, actualSub);
	}
	
	@Test
	public void testMul() {
		int a =20;
		int b =10;
		int mul = a*b;
		Calculator calc = new Calculator();
		int actualMul = calc.mul(a, b);
		Assertions.assertEquals(mul, actualMul);
	}
	
	@Test
	public void testDiv() {
		int a =20;
		int b =10;
		int div = a/b;
		Calculator calc = new Calculator();
		float actualDiv = calc.div(a, b);
		Assertions.assertEquals(div, actualDiv);
	}
	
	
	@Test
    @DisplayName("Passed Sum")
    void passedSumTest(TestInfo testInfo) {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(10, calculator.sum(5, 5));
    }
	
	@Test
    @DisplayName("Failed Sum")
    void failedSumTest(TestInfo testInfo) {
        Calculator calculator = new Calculator();
        Assertions.assertNotEquals(10, calculator.sum(5, 2));
    }
	
	@Test
    @DisplayName("Passed Sub")
    void passedSubTest(TestInfo testInfo) {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(10, calculator.sub(20, 10));
    }
	
	@Test
    @DisplayName("Failed Sub")
    void failedSubTest(TestInfo testInfo) {
        Calculator calculator = new Calculator();
        Assertions.assertNotEquals(10, calculator.sub(5, 2));
    }
	
	@Test
    @DisplayName("Passed Mul")
    void passedMulTest(TestInfo testInfo) {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(10, calculator.mul(5, 2));
    }
	
	@Test
	@DisplayName("Passed Div")
	void paasedDivTest(TestInfo testinfo) {
		Calculator calculator = new Calculator();
		Assertions.assertEquals(5, calculator.div(10, 2));
	}
	
	@DisplayName("Failed Div")
	void failedDivTest(TestInfo testinfo) {
		Calculator calculator = new Calculator();
		Assertions.assertNotEquals(7, calculator.div(10, 2));
	}

}

