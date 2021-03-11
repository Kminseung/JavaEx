package com.javaex.network.echoserver;

import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {
	public static void main(String[] args) {
		Socket socket = null;
		
		try {
			// 소켓 객체 생성
			socket = new Socket();
			
			// 시작 메세지
			System.out.println("<클라이언트 시작>");
			System.out.println("CLIENT : [연결 요청]");
			
			// 접속 시도
			InetSocketAddress remote = new InetSocketAddress("127.0.0.1", 10000);
			socket.connect(remote);
			
			// 접속 성공
			System.out.println("CLIENT : [서버 연결 성공]");
			
			// 후처리
			System.out.println("<클라이언트 종료>");
		}
		catch(ConnectException e) {
			System.err.println("[접속 거부]");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				socket.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
