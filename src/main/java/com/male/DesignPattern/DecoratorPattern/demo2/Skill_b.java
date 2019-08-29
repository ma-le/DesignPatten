package com.male.DesignPattern.DecoratorPattern.demo2;

public class Skill_b extends Skills{

	private String skillName;
	
	public Skill_b(Hero hero, String skillName){
		super(hero);
		this.skillName = skillName;
	}
	
	public void learnSkills() {
		System.out.println(" b :"+skillName);
		super.learnSkills();
	}

}
