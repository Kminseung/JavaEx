package com.javaex.thread.v2;

public class MainThread {

	public static void main(String[] args) {
		// main thread의 흐름과 다른 별도의 작업 흐름
		Thread thread = new DigitThread();
		thread.setName("DigitThread");
		
		// 쓰레드 시작
		thread.start();		// start() 메서드 내에서 run() 메서드를 대신 수행
		
		// 주의
		//thread.run();
		
		Thread thread2 = new Thread(new AlpabetRunnable());
		thread2.setName("AlpabetRunnalbe");
		// 생성자에 run 메서드가 구현된 runnable 객체를 전달
		thread2.start();
		
		// Working Tread의 제워권을 유지하기 위해
		// 작업 흐름을 main 쓰레드에 합류
		try {
			thread.join();
			thread.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("MaainThread 종료!");		
	}

}
