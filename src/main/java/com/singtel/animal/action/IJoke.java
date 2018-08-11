package com.singtel.animal.action;

/**
 * Method related to joke action
 * 
 * @author Suria
 */
public interface IJoke {
	
	public default void joke(){
		System.out.println("I am joking");
	}
}
