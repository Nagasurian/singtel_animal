package com.singtel.animal.type;

import com.singtel.animal.action.ISwim;
import com.singtel.animal.group.Mammals;

public class Dolphin extends Mammals implements ISwim {

	public Dolphin() {
		super.attr.setSwim(true);
	}

	public void swim() {
		ISwim.super.swim();

	}
}
