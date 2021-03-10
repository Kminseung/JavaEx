package com.javaex.thread.synchronize;

public class User extends Thread{
	private SharedMemory memory;
	private int data;
	
	// generator
	public User(String name, SharedMemory memory, int data) {
		this.setName(name);		// 쓰레드 이름 설정
		this.memory = memory;	// 공유 객체 설정
		this.data = data;
	}

	@Override
	public void run() {
		if(memory != null) {
			memory.setMemory(data);
		}
	}
	
	
	
}
