package com.sarariman.observer.serviceImpl;

import java.util.ArrayList;

import com.sarariman.observer.service.Observer;
import com.sarariman.observer.service.Subject;

public class WeatherData implements Subject {
	
	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData() {
		observers = new ArrayList<Observer>();
	}
	
	public void registerObserver(Observer o) {
		observers.add(o);

	}

	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i>0) {
			observers.remove(i);
		}

	}

	public void notifyObserver() {
		for (Observer observer : observers) {
			observer.update(temperature,humidity,pressure);
		}
	}
	
	public void measurementsChanged() {
		this.notifyObserver();
	}
	
	public void setMeasurements(float temperature,float humidity,float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.measurementsChanged();
		
	}

}
