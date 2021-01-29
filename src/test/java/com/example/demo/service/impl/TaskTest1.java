package com.example.demo.service.impl;

import com.example.demo.DemoApplication;
import org.junit.Test ;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TaskTest1 {
	@Test
	public void test(){
		assertEquals(6,new Cakulate().add(3,3));
	}
}
