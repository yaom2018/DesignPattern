package com.sarariman.designpattern.mini;

import com.sarariman.designpattern.mini.interImpl.FlyNoWing;
import com.sarariman.designpattern.mini.interImpl.Quack;

public class ModelDuck extends Duck {
	
	public ModelDuck() {
		flyBehavior = new FlyNoWing();
		quackBehavior = new Quack();
	}

	public void display() {
		System.out.println("i am a model duck");
		
	}
	
	

}
