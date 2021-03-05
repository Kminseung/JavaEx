package com.javaex.oop.summary;

public class SummaryApp {
	// Kungfu Gym
	static KungfuSkill[] dojang;	// interface array
	
	public static void main(String[] args) {
		Human h1 = new Human("Hong", 30);
		Human h2 = new TheOne("NEO", 50);
		
		Panda p1 = new Panda("Ping", 20);
		Panda p2 = new KungfuPanda("Pho", 15);
		
		fight(h1);
		fight(h2);
		fight(p1);
		fight(p2);
		
		fly(h1);
		fly(h2);
		fly(p1);
		fly(p2);
		
		dojang = new KungfuSkill[] {
				// (KungfuSkill)h1,	// unable to do casting
				(KungfuSkill)h2, 
				// (KungfuSkill)p1,	// unable to do casting
				(KungfuSkill)p2
				};
		
		for(KungfuSkill member : dojang) {
			member.kungfu();
		}
	}
	
	public static void fight(Animal actor) {
		// Can do Kungfu?
		if(actor instanceof KungfuSkill) {
			((KungfuSkill)actor).kungfu();
		}
		else {
			System.out.println(actor.name + ": cannnot do Kungfu");
		}
	}
	
	public static void fly(Animal actor) {
		// Can fly?
		if(actor instanceof Flyable) {
			((Flyable)actor).fly();
		}
		else {
			System.out.println(actor.name + ": cannnot do fly");
		}
	}
	
}
