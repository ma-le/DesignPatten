package com.male.DesignPattern.DecoratorPattern.demo2;

public class Skills implements Hero {

	private Hero hero;
	
	public Skills(Hero hero){
		this.hero = hero;
	}
	
	@Override
	public void learnSkills() {
		if(null != hero)
			hero.learnSkills();
	}

}
