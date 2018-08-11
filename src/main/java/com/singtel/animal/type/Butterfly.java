package com.singtel.animal.type;

import com.singtel.animal.action.IFly;
import com.singtel.animal.action.IWalk;
import com.singtel.animal.group.Insect;

public class Butterfly extends Insect implements IFly, IWalk {

	public Butterfly() {

		super.attr.setFly(true);
	}

	@Override
	public void fly() {

		IFly.super.fly();

	}

	@Override
	public void walk() {

		IWalk.super.walk();
	}

}
