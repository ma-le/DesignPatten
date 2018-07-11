package com.male.DecoratorPattern.demo2;

import java.util.HashMap;
import java.util.Map;

public class test {

	public static void main(String[] args) {
		Hero hero =  new BlindMonk("ßÕßÕà½à½");
		
		Skills skills = new Skills(hero);
		
		Skills skilla = new Skill_a(skills, "aÀ÷º¦");
		
		Skills skillb = new Skill_b(skilla, "b¸üÀ÷º¦");
		
		skillb.learnSkills();
		
		Map<Object, Object> map = new HashMap<Object, Object>();
		map.put(3, 3);
	}
}
