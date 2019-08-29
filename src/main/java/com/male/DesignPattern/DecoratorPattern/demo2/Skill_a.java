package com.male.DesignPattern.DecoratorPattern.demo2;

public class Skill_a extends Skills{

	private String skillName;
	
	public Skill_a(Hero hero, String skillName) {
		super(hero);
		this.skillName = skillName;
	}

	public void learnSkills(){
		System.out.println("  :"+skillName);
		super.learnSkills();
	}
}
