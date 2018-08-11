package com.singtel.animal.type;

import com.singtel.animal.group.Bird;

public class Chicken extends Bird {

	private String sound = "Cluck, cluck";

	public Chicken() {
		super.attr.setSound(sound);
		super.attr.setFly(false);
	}

	@Override
	public void fly() {
		System.out.println("I can't fly");
	}

}
