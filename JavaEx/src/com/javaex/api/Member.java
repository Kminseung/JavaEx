package com.javaex.api;

public class Member implements Comparable{
	String name;
	
	public Member(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + "]";
	}

	// Compare of 2 objects
	@Override
	public int compareTo(Object o) {
		// -1, 0, 1
		// a == b : 0
		// a < b : -1
		// a > b : 1
		if(o instanceof Member) {
			Member other = (Member)o;
			return name.compareTo(other.name);
		}
		return 0;
	}
	
}
