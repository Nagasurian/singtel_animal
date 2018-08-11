package com.singtel.animal.action;

/**
 * Method related to fly action
 * 
 * @author Suria
 */
public interface IFly {

	public default void fly(){
		System.out.println("I am flying");
	}
}
