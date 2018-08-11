package com.singtel.animal.group;

import com.singtel.animal.Animal;
import com.singtel.animal.action.IFly;
import com.singtel.animal.action.ISing;

import com.singtel.animal.action.IWalk;

/**
 * Define bird as a group of animal. To add some general behavior of bird.
 * 
 * @author Suria
 */
public class Bird extends Animal implements IFly, ISing, IWalk {
	
	public Bird() {
		super.attr.setWalk(true);
		super.attr.setFly(true);
		super.attr.setSing(true);
	}
}
