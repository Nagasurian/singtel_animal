package com.singtel.animal.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.singtel.animal.group.Bird;

/**
 * Similar implementation for all the other functions need to be done
 * 
 * @author Suria
 */
public class SampleUnitTest {

	Bird bird;

	@Before
	public void init() {
		bird = new Bird();
	}

	@Test
	public void sing() {
		assertEquals(bird.sing(), "I am singing");
	}

}
