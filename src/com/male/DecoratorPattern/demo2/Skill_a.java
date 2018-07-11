package com.male.DecoratorPattern.demo2;

public class Skill_a extends Skills{

	private String skillName;
	
	public Skill_a(Hero hero, String skillName) {
		super(hero);
		this.skillName = skillName;
	}

	public void learnSkills(){
		System.out.println("ѧϰ�˼���a :"+skillName);
		super.learnSkills();
	}
}
