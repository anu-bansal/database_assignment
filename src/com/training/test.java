package com.training;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test {
@SuppressWarnings("unused")
public class Test {

	@org.junit.Test
	public void test() {
		Goal g2=new Goal();
		String result=g2.operator();
		assertEquals("hello",result);
	}
}
	

}