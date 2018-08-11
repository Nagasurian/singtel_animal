package com.singtel.animal.test;

import com.singtel.animal.Animal;
import com.singtel.animal.group.Bird;
import com.singtel.animal.group.Fish;
import com.singtel.animal.type.Cat;
import com.singtel.animal.type.Chicken;
import com.singtel.animal.type.ClownFish;
import com.singtel.animal.type.Dog;
import com.singtel.animal.type.Dolphin;
import com.singtel.animal.type.Duck;
import com.singtel.animal.type.Parrot;
import com.singtel.animal.type.Shark;
import com.singtel.enums.Gender;

public class Solution {

	public static void main(String[] args) {

		// A. Ques 1
		System.out.println("A. Ques 1");
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();

		System.out.println();

		// A. Ques 2
		System.out.println("A. Ques 2");
		Duck duck = new Duck();
		duck.makeSound();
		duck.swim();// swim can be implemented in bird if all bird can swim

		System.out.println();

		Bird chicken = new Chicken();
		chicken.makeSound();
		chicken.fly();

		System.out.println();

		// A. Ques 3
		System.out.println("A. Ques 3");
		Bird rooster = new Chicken(Gender.MALE);
		rooster.makeSound();

		System.out.println();

		// A. Ques 4
		System.out.println("A. Ques 4");
		Parrot parrot = new Parrot();
		Animal dog = new Dog();
		parrot.livesWith(dog);
		parrot.makeSound();
		Animal cat = new Cat();
		parrot.livesWith(cat);
		parrot.makeSound();

		System.out.println();

		// B. Ques 1 No sing and walk methods for fish
		System.out.println("B. Ques 1");
		Fish fish = new Fish();
		fish.swim();

		System.out.println();

		System.out.println("B. Ques 2");

		Fish shark = new Shark();
		shark.size();
		shark.color();

		ClownFish clownfish = new ClownFish();
		clownfish.size();
		clownfish.color();
		clownfish.joke();

		Shark bigShark = new Shark();
		bigShark.eat(fish);
		
		System.out.println();

		System.out.println("B. Ques 3");

		Dolphin dolphin = new Dolphin();
		dolphin.swim();
	}
}
