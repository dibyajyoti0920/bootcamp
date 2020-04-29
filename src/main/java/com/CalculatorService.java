package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorService {
	
	
	@GetMapping("/sum")
	public int add() {
		int a=20,b=10;
		return a+b;
		
	}
	@GetMapping("/product")
	public int multiply() {
		int a=20,b=10;
		return a*b;
	}
	@GetMapping("/division")
	public int divide() {
		int a=20,b=10;
		return a/b;
	}
	@GetMapping("/avg")
	public int average() {
		int a=20,b=10;
		return ((a+b)/2);
	}
	@GetMapping("/diff")
	public int subtract() {
		int a=20,b=10;
		return a-b;
	}
	@GetMapping("/max")
	public int maximum() {
		int a=20,b=10;
		return Math.max(a, b);
	}
}
