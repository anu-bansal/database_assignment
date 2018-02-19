package com.training;

import static org.junit.jupiter.api.Assertions.*;

public class Test {
	Goal g2=new Goal();
	@org.junit.jupiter.api.Test
	public void test1() {		
		assertEquals("in operator",g2.operator());
	}
	@org.junit.jupiter.api.Test
    void test2() {
    	assertEquals("selectinfo checked",g2.selectInfo());
    }	
}
	