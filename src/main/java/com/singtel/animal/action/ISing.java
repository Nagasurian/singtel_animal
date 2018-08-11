package com.singtel.animal.action;

/**
 * Method related to sing action
 * 
 * @author Suria
 */
public interface ISing {

	public default String sing(){
		String sing = "I am singing";
		System.out.println(sing);
		return sing;
	}
}
