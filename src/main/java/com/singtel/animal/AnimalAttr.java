package com.singtel.animal;

/**
 * Animal attributes, you may add new attributes without breaking existing codes
 * 
 * @author Suria
 */
public class AnimalAttr {

	private String sound;
	private boolean walk;
	private boolean sing;
	private boolean fly;
	private boolean swim;

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public boolean isWalk() {
		return walk;
	}

	public void setWalk(boolean walk) {
		this.walk = walk;
	}

	public boolean isSing() {
		return sing;
	}

	public void setSing(boolean sing) {
		this.sing = sing;
	}

	public boolean isFly() {
		return fly;
	}

	public void setFly(boolean fly) {
		this.fly = fly;
	}

	public boolean isSwim() {
		return swim;
	}

	public void setSwim(boolean swim) {
		this.swim = swim;
	}
}
