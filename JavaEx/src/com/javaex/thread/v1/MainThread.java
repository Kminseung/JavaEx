package com.javaex.thread.v1;

public class MainThread {

	public static void main(String[] args) {
		// main thread의 흐름과 다른 별도의 작업 흐름
		Thread thread = new DigitThread();
		thread.setName("DigitThread");
		
		// 쓰레드 시작
		thread.start();		// start() 메서드 내에서 run() 메서드를 대신 수행
		
		// 주의
		//thread.run();
		
		// A ~ Z 출력
		for(char c='A'; c<='Z'; c++) {
			System.out.println("MainThread: " + c);
			
			// 잠시 대기
			try {
				Thread.sleep(300);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
