package com.singtel.animal.action;

/**
 * Method related to eat action
 * 
 * @author Suria
 */
public interface IEat {
	
	public default void eat(){
		System.out.println("I am eating");
	}
}
