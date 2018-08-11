package com.singtel.animal.type;

import com.singtel.animal.Animal;
import com.singtel.animal.group.Bird;

public class Parrot extends Bird {
	
	private String sound = "Parrot sound";
	
	public Parrot() {
		super.attr.setSound(sound);
	}
	
	public void livesWith(Animal animal) {
		super.attr.setSound(animal.getSound());
	}
}
