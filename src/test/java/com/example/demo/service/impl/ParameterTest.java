package com.example.demo.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class ParameterTest {

	int expected = 0;
	int input1 = 0;
	int input2 = 0;

	@Parameterized.Parameters
	public static Collection<Object[]> t() {
		Object[][] objects = {
				{3, 1, 2},
				{6, 3, 3}
		};
		//Arrays;
		//ArrayList;
		//Array
		return Arrays.asList(objects);
	}


	public ParameterTest(int expected,int input1,int input2){
		this.expected = expected;
		this.input1 = input1;
		this.input2 = input2;
	}

	@Test
	public void testAdd(){
	 	assertEquals(expected,new Cakulate().add(input1,input2));
	}

}
