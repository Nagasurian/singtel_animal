package com.singtel.animal.type;

import com.singtel.animal.action.ISwim;
import com.singtel.animal.group.Bird;

public class Duck extends Bird implements ISwim {
	
	private String sound = "Quack, quack";
	
	public Duck() {
		super.attr.setSound(sound);
		super.attr.setFly(false);
	}
	
	
}
