package com.singtel.animal.type;

import com.singtel.animal.group.Fish;
import com.singtel.enums.Color;
import com.singtel.enums.Size;

public class Shark extends Fish {
	
	public Shark() {
		super.attr.setColor(Color.GRAY);
		super.attr.setSize(Size.LARGE);
	}
	
	public void eat(Fish fish) {
		System.out.println("I am eating fish");
	}
}
