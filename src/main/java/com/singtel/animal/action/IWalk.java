package com.singtel.animal.action;

/**
 * Method related to walk action
 * 
 * @author Suria
 */
public interface IWalk {
	
	public default void walk(){
		System.out.println("I am walking");
	}
}
