package com.singtel.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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


/**
 * This class handles Animal related business logics.
 * 
 * @author Suria
 */
@Transactional
@Service("AnimalService")
public class AnimalServiceImpl implements AnimalService {

	@Override
	public Animal[] getAll() {
		
		return new Animal[]{
				 new Duck(),
				 new Chicken(),
				 new Parrot(),
				 new Shark(),
				 new ClownFish(),
				 new Dolphin(),
				 new Dog(),
				 new Butterfly(),
				 new Cat()
				};
	}

	
}
