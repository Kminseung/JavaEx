package com.javaex.collection.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		// Queue는 인터페이스, 실체 클래스는 List관련 실제 클래스를 사용
		Queue<Integer> queue = new LinkedList<>();
		
		for(int i=0; i<10; i++) {
			queue.offer(i);
			System.out.println("Queue : " + queue);
		}
		
		// 데이터 확인
		int item = queue.peek();
		System.out.println("PEEK : " + item);
		System.out.println("Queue : " + queue);
		
		// 데이터 인출 : poll()
		item = queue.poll();
		System.out.println("POLL : " + item);
		
		// queue에서 poll을 할 때, 비어있는지 반드시 확인
		while(!queue.isEmpty()) {
			System.out.println("POLL : " + queue.poll());
			System.out.println("Queue : " + queue);
		}
	}

}
