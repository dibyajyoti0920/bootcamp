package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.MessageService;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestCalculatorService{
	
	int num1=20,num2=10;
	CalculatorService cal=new CalculatorService();
	
	@Test
	public void testSum() {
		Assertions.assertEquals(cal.add(num1,num2),30);
	}
	@Test
	public void testProduct() {
		Assertions.assertEquals(cal.multiply(num1,num2),200);
	}
	@Test
	public void testQuotient() {
		Assertions.assertEquals(cal.divide(num1,num2),2);
	}
	@Test
	public void testMean() {
		Assertions.assertEquals(cal.average(num1,num2),15);
	}
	@Test
	public void testDiff() {
		Assertions.assertEquals(cal.subtract(num1,num2),10);
	}
	@Test
	public void testMaxValue() {
		Assertions.assertEquals(cal.maximum(num1,num2),20);
	}
}