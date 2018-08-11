package com.singtel.animal.action;

/**
 * Method related to swim action
 * 
 * @author Suria
 */
public interface ISwim {

	public default void swim(){
		System.out.println("I can swim");
	}
}
