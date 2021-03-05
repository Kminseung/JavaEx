package com.javaex.api.objectclass.v4;

import java.util.Arrays;

public class Scoreboard implements Cloneable {
	// reference field
	private int[] scores;
	
	// generator
	public Scoreboard(int[] scores) {
		this.scores = scores;
	}

	// getter and setter
	public int[] getScores() {
		return scores;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}

	@Override
	public String toString() {
		return "Scoreboard [scores=" + Arrays.toString(scores) + "]";
	}
	
	public Scoreboard getClone() {
		Scoreboard clone = null;
		
		try {
			clone = (Scoreboard)clone();
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return clone;
	}
	
	// Deep Replication
	// Need to override clone method
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// shallow
		Scoreboard clone = (Scoreboard)super.clone();
		
		//deep
		clone.scores = Arrays.copyOf(scores, scores.length);
		
		return clone;
	}
	
}
