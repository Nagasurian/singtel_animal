package com.singtel.animal.type;

import com.singtel.animal.group.Mammals;

public class Dog extends Mammals {
	
	private static String sound = "Woof, woof";
	
	public Dog() {
		super.attr.setSound(sound);
		super.attr.setWalk(true);
	}

}
