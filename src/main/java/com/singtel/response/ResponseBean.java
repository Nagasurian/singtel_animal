package com.singtel.response;

import com.singtel.animal.Animal;
import com.singtel.animal.type.Butterfly;
import com.singtel.animal.type.Cat;
import com.singtel.animal.type.Chicken;
import com.singtel.animal.type.ClownFish;
import com.singtel.animal.type.Dog;
import com.singtel.animal.type.Dolphin;
import com.singtel.animal.type.Duck;
import com.singtel.animal.type.Parrot;
import com.singtel.animal.type.Shark;
import com.singtel.enums.Color;
import com.singtel.enums.Size;

public class ResponseBean {

	private String animal;
	private String sound;
	private Size size;
	private Color color;
	private boolean walk;
	private boolean sing;
	private boolean fly;
	private boolean swim;

	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
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
	
	public void map(Animal animal) {
		
		if(animal instanceof Dog){
			this.animal = Dog.class.getName();
		}
		else if(animal instanceof Butterfly){
			this.animal = Butterfly.class.getName();
		}
		else if(animal instanceof Cat){
			this.animal = Cat.class.getName();
		}
		else if(animal instanceof Chicken){
			this.animal = Chicken.class.getName();
		}
		else if(animal instanceof ClownFish){
			this.animal = ClownFish.class.getName();
		}
		else if(animal instanceof Dolphin){
			this.animal = Dolphin.class.getName();
		}
		else if(animal instanceof Duck){
			this.animal = Duck.class.getName();
		}
		else if(animal instanceof Parrot){
			this.animal = Parrot.class.getName();
		}
		else if(animal instanceof Shark){
			this.animal = Shark.class.getName();
		}
		
		this.setColor(animal.getAttr().getColor());
		this.setSize(animal.getAttr().getSize());
		this.setSound(animal.getAttr().getSound());
	}

}
