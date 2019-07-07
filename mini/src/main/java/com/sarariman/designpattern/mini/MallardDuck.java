package com.sarariman.designpattern.mini;

import com.sarariman.designpattern.mini.interImpl.FlyNoWing;
import com.sarariman.designpattern.mini.interImpl.Quack;

public class MallardDuck extends Duck {
	
	public MallardDuck(){
		quackBehavior = new Quack();
//		flyBehavior = new FlyWithWings();
		flyBehavior = new FlyNoWing();
	}
	
	public void display(){
		System.out.println("i am a real mallard duck");
	}

}
