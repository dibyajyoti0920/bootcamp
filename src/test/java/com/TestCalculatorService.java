package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestCalculatorService{
	
	int num1=20,num2=10;
	CalculatorService cal=new CalculatorService();
	
	@Test
	public void testSum() {
		Assertions.assertEquals(cal.add(),30);
	}
	@Test
	public void testProduct() {
		Assertions.assertEquals(cal.multiply(),200);
	}
	@Test
	public void testQuotient() {
		Assertions.assertEquals(cal.divide(),2);
	}
	@Test
	public void testMean() {
		Assertions.assertEquals(cal.average(),15);
	}
	@Test
	public void testDiff() {
		Assertions.assertEquals(cal.subtract(),10);
	}
	@Test
	public void testMaxValue() {
		Assertions.assertEquals(cal.maximum(),20);
	}
}