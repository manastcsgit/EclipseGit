package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tcs.Animal;

public class FlyingTest {

	@Test
	public void test() {
		Animal animal = new Animal();
		String f=animal.fly("Bird");
		assertTrue("FLY".equals(f));
	}

}
