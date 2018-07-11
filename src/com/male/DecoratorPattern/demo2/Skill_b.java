package com.male.DecoratorPattern.demo2;

public class Skill_b extends Skills{

	private String skillName;
	
	public Skill_b(Hero hero, String skillName){
		super(hero);
		this.skillName = skillName;
	}
	
	public void learnSkills() {
		System.out.println("学习了技能b :"+skillName);
		super.learnSkills();
	}

}
