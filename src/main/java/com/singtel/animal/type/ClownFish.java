package com.singtel.animal.type;

import com.singtel.animal.action.IJoke;
import com.singtel.animal.group.Fish;
import com.singtel.enums.Color;
import com.singtel.enums.Size;

public class ClownFish extends Fish implements IJoke {

	public ClownFish() {
		super.attr.setColor(Color.ORANGE);
		super.attr.setSize(Size.SMALL);
	}
	
}
