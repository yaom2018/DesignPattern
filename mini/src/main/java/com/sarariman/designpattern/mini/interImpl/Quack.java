package com.sarariman.designpattern.mini.interImpl;

import com.sarariman.designpattern.mini.inter.QuackBehavior;

public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("i am quack");

	}


}
