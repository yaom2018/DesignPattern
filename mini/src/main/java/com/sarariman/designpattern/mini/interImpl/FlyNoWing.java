package com.sarariman.designpattern.mini.interImpl;

import com.sarariman.designpattern.mini.inter.FlyBehavior;

public class FlyNoWing implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("i am not fly!");

	}

}
