package com.javaex.api.generics.v2;

// Generic
// 설계시에는 내부 타입을 지정하지 않고
// 인스턴스화 할 때 내부 타입을 지정해주는 방식
public class GenericBox<T> {	// <Templet>
	private T content;

	// getter and setter
	public T getContent() {
		return content;
	}
	public void setContent(T content) {
		this.content = content;
	}
	
	
}
