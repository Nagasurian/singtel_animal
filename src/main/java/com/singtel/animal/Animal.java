package com.singtel.animal;

import com.singtel.animal.action.IEat;
import com.singtel.animal.action.ISound;

/**
 * Superclass for all the animals
 * 
 * @author Suria
 */
public class Animal implements ISound, IEat {

	protected AnimalAttr attr;

	public Animal() {
		this.attr = new AnimalAttr();
	}

	public boolean canWalk() {
		return this.attr.isWalk();
	}

	public boolean canFly() {
		return this.attr.isFly();
	}

	public boolean canSing() {
		return this.attr.isSing();
	}

	public boolean canSwim() {
		return this.attr.isSwim();
	}

	@Override
	public void makeSound() {

		if (this.attr.getSound() == null) {
			System.out.println("I don't make sound or you haven't set a sound for me");
		} else {
			System.out.println(this.attr.getSound());
		}
	}

	public void color() {
		System.out.println(this.attr.getColor());
	}

	public void size() {
		System.out.println(this.attr.getSize());
	}

	public String getSound() {
		return this.attr.getSound();
	}

	public AnimalAttr getAttr() {
		return attr;
	}

}
