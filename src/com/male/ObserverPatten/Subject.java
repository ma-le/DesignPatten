package com.male.ObserverPatten;

import java.util.ArrayList;
import java.util.List;

public class Subject {

	private List<Observer> observers = new ArrayList<Observer>();
	
	private int moneyRate;
	
	public int getMoneyRate(){
		return moneyRate;
	}
	
	public void setMoneyRate(int moneyRate){
		this.moneyRate = moneyRate;
		notifyAllObserver();
	}
	
	public void add(Observer observer){
		observers.add(observer);
	}
	
	public void notifyAllObserver(){
		for (Observer observer : observers) {
			observer.update();
		}
	}
}
