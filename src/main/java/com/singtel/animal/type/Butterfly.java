package com.singtel.animal.type;

import com.singtel.animal.action.IFly;
import com.singtel.animal.action.IWalk;
import com.singtel.animal.group.Insect;
import com.singtel.enums.ButterflyMetamorphosis;

public class Butterfly extends Insect implements IFly, IWalk {

	private ButterflyMetamorphosis metamorphosis = ButterflyMetamorphosis.BUTTERFLY;
	
	public Butterfly() {
		
		if (metamorphosis == ButterflyMetamorphosis.CATERPILLAR) {
			super.attr.setWalk(true);
			super.attr.setFly(false);
		}
		else {
			super.attr.setWalk(false);
			super.attr.setFly(true);
		}
	}
	
	@Override
	public void fly() {

		if (metamorphosis == ButterflyMetamorphosis.CATERPILLAR) {
			System.out.println("I can't fly");
		} else {
			IFly.super.fly();
		}

	}
	
	@Override
	public void walk() {
		
		if(metamorphosis == ButterflyMetamorphosis.CATERPILLAR){
			IWalk.super.walk();
		}
		else {
			System.out.println("I can't walk");
		}
	}

	public void isAt(ButterflyMetamorphosis metamorphosis) {
		this.metamorphosis = metamorphosis;
		
		if(metamorphosis == ButterflyMetamorphosis.CATERPILLAR){
			super.attr.setWalk(true);
			super.attr.setFly(false);
		}
		else if(metamorphosis == ButterflyMetamorphosis.BUTTERFLY){
			super.attr.setWalk(false);
			super.attr.setFly(true);
		}
		
	}
}
