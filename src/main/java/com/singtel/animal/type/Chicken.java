package com.singtel.animal.type;

import com.singtel.animal.group.Bird;
import com.singtel.enums.Gender;
import com.singtel.util.Utility;

public class Chicken extends Bird {

	private String sound = "Cluck, cluck";
	private String roosterSound = Utility.getLabel("sound");

	public Chicken() {
		super.attr.setSound(sound);
		super.attr.setFly(false);
	}

	public Chicken(Gender gender) {

		if (gender == Gender.MALE) {
			super.attr.setSound(roosterSound);
		} else {
			new Chicken();
		}

	}

	@Override
	public void fly() {
		System.out.println("I can't fly");
	}

}
