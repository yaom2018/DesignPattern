package com.sarariman.designpattern.mini.interImpl;

import com.sarariman.designpattern.mini.inter.QuackBehavior;

public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("squeak");

	}


}
