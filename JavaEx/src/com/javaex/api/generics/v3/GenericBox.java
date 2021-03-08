package com.javaex.api.generics.v3;

// Generic
// T: Type
// R: Return Type
// K: Key
// V: Value
// ...
public class GenericBox<K, V> {	// <Templet>
	K key;
	V content;
	
	// getter and setter
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	
	public V getContent() {
		return content;
	}
	public void setContent(V content) {
		this.content = content;
	}
	
}
