package com.sarariman.observer.serviceImpl;

import com.sarariman.observer.service.DisplayElement;
import com.sarariman.observer.service.Observer;
import com.sarariman.observer.service.Subject;

public class CurrentCoditionsDisplay implements Observer, DisplayElement {
	
	private float temperature;
	private float humidity;
	private float pressure;
	private Subject weatherData;
	
	public CurrentCoditionsDisplay(Subject watherData) {
		this.weatherData = watherData;
		watherData.registerObserver(this);
		
	}

	public void display() {
		 System.out.println("Current conditions: " + temperature + 
				 "F degrees and " + humidity + "% humidity");

	}

	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.display();

	}

}
