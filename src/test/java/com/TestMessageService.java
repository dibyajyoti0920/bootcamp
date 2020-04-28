package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.MessageService;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestMessageService {

	@Test
	public void testMessage() {
		MessageService ms = new MessageService();
		System.out.println("hello");
		Assertions.assertEquals(ms.sayHello(), "hello DevOps people!");
	}
	
	@Test
	public void testCharMatch() {
		MessageService ms = new MessageService();
		Assertions.assertEquals(ms.sayHello().charAt(0),'h');
	}
	@Test
	public void testBlockChar() {
		MessageService ms = new MessageService();
		Assertions.assertEquals(Character.toUpperCase(ms.sayHello().charAt(0)),'H');
	}
	@Test
	public void testEnding() {
		MessageService ms = new MessageService();
		int l=ms.sayHello().length();
		Assertions.assertEquals(ms.sayHello().charAt(l-1),'!');
		
	}
	
	
}