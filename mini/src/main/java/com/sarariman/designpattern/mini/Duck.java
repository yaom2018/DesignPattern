package com.sarariman.designpattern.mini;

import com.sarariman.designpattern.mini.inter.FlyBehavior;
import com.sarariman.designpattern.mini.inter.QuackBehavior;

public abstract class Duck {
	
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck(){
		
	}
	
	public abstract void display();
	
	public void performFly() {
		flyBehavior.fly();
		
	}
	
	public void performQuack(){
		
		quackBehavior.quack();
	}
	
	public void swim() {
		System.out.println("All ducks float,even decoys");
	}

	public FlyBehavior getFlyBehavior() {
		return flyBehavior;
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public QuackBehavior getQuackBehavior() {
		return quackBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	
	

}
