package com.sarariman.designpattern.mini;

import com.sarariman.designpattern.mini.interImpl.FlyWithWings;
import com.sarariman.designpattern.mini.interImpl.Quack;

public class MallardDuck extends Duck {
	
	public MallardDuck(){
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	public void display(){
		System.out.println("i am a real mallard duck");
	}

}
