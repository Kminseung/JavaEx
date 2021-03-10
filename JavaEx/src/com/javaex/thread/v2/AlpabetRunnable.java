package com.javaex.thread.v2;

// run 메서드만 구현, Thread의 생성자로 전달
public class AlpabetRunnable implements Runnable {

	@Override
	public void run() {
		// A ~ Z 출력
		for(char c='A'; c<='Z'; c++) {
			System.out.println(Thread.currentThread().getName() + " : " + c);
					
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
