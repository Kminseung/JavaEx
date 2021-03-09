package com.javaex.collection.hash;

public class ClassRoom {
	// field
	private String subject;
	private String roomName;
	
	// generator
	public ClassRoom(String subject) {
		this.subject = subject;
	}
	public ClassRoom(String subject, String roomName) {
		this.subject = subject;
		this.roomName = roomName;
	}

	@Override
	public String toString() {
		return "ClassRoom [subject=" + subject + ", roomName=" + roomName + "]";
	}
	
	@Override
	public int hashCode() {
		// 과목은 같으나 강의실이 다를 수 있음
		// 과목의 hashcode가 같으면 식별자가 같은 것으로 간주
		return subject.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof ClassRoom) {
			ClassRoom other = (ClassRoom)obj;
			return subject.equals(other.subject);
		}
		return super.equals(obj);
	}
	
	
}
