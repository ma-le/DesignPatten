package com.male.DesignPattern.DecoratorPattern.demo2;

import java.util.HashMap;
import java.util.Map;

public class test {

	public static void main(String[] args) {
		Hero hero =  new BlindMonk(" ");
		
		Skills skills = new Skills(hero);
		
		Skills skilla = new Skill_a(skills, " ");
		
		Skills skillb = new Skill_b(skilla, "b������");
		
		skillb.learnSkills();
		
		Map<Object, Object> map = new HashMap<Object, Object>();
		map.put(3, 3);
	}
}
