package com.sarariman.designpattern.mini.interImpl;

import com.sarariman.designpattern.mini.inter.QuackBehavior;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("mutequack");

	}


}
