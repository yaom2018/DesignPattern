package com.sarariman.designpattern.mini;

import com.sarariman.designpattern.mini.inter.FlyBehavior;
import com.sarariman.designpattern.mini.inter.QuackBehavior;

public abstract class Duck {
	
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck(){
		
	}
	
	public void performQuack(){
		
		quackBehavior.quack();
	}
	

}
