package com.example.demo.service.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.transaction.BeforeTransaction;

import static org.junit.jupiter.api.Assertions.*;

class CakulateTest {

	/*
	 * @Test:将一个普通的方法修饰成一个测试方法
	 * @Test(expected=XX.class) //当程序报错时 收集错误不让程序
	 * @Test(timeout =毫秒) //这个注解是为了，当你的程序有循环的时候 为了避免出现死循环的时候 需要限制执行时间
	 * @BeforeEach 方法运行前被执行
	 * @AfterEach 方法运行后被执行
	 * @Disabled 所有修饰的测试方法会被测试运行器忽略
	 * @RunWith 可以更改测试运行器
	 */





	@BeforeEach
	void setUp() {
		System.out.println("this is test before");
	}

	@AfterEach
	void tearDown() {
		System.out.println("this is test after");
	}


	@Test
	void add() {
		System.out.println("this is test");
		assertEquals(6,new Cakulate().add(3,3));
	}

	@Test
	void subtract() {
		assertEquals(6,new Cakulate().add(4,3));
	}

	@Test
	void multiply() {
	}

	@Test
	void divide() {
		assertEquals(6,new Cakulate().divide(4,4));
	}
}