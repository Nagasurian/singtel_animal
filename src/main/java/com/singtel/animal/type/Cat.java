package com.singtel.animal.type;

import com.singtel.animal.group.Mammals;

public class Cat extends Mammals {
	
	private String sound = "Meow";
	
	public Cat() {
		super.attr.setSound(sound);
		super.attr.setWalk(true);
	}

}
