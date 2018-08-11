package com.singtel.animal;

/**
 * Superclass for all the animals
 * 
 * @author Suria
 */
public class Animal {

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

	public AnimalAttr getAttr() {
		return attr;
	}

}
