package com.singtel.animal.group;

import com.singtel.animal.Animal;
import com.singtel.animal.action.ISwim;

/**
 * Define fish as a group of animal. To add some general behavior of fish.
 * 
 * @author Suria
 */
public class Fish extends Animal implements ISwim {
	
	public Fish() {
		super.attr.setSwim(true);
	}
}
