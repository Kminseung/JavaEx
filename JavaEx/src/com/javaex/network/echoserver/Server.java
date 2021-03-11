package com.javaex.network.echoserver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		// Server Socket
		ServerSocket serverSocket = null;
		
		try {
			// Bind - IP 연결
			serverSocket = new ServerSocket();
			InetSocketAddress ips = new InetSocketAddress("0.0.0.0", 10000);
			serverSocket.bind(ips);
			
			// 시작 메시지
			System.out.println("<서버 시작>");
			System.out.println("SERVER : [연결 대기]");
			
			// 연결 대기
			while(true) {
				Socket socket = serverSocket.accept();
				Thread thread = new ServerThread(socket);
				thread.start();
			}
			
			// ----- Working Thread Logic 
			// 클라이언트 정보 확인
//			InetSocketAddress socketAddress = (InetSocketAddress)socket.getRemoteSocketAddress();	// 원격지 소켓의 주소 확인
//			System.out.println("SERVER : [클라이언트 연결 성공] " + "CLIENT : " + socketAddress.getAddress() + socketAddress.getPort());
//			
//			//  메시지 수신
//			InputStream is = socket.getInputStream();
//			Reader isr = new InputStreamReader(is);
//			BufferedReader br = new BufferedReader(isr);
//			
//			// Echo Back을 위한 OutputStream
//			OutputStream os = socket.getOutputStream();
//			Writer osw = new OutputStreamWriter(os, "UTF-8");
//			BufferedWriter bw = new BufferedWriter(osw);
//			
//			// 메시지 읽어오기
//			String message;
//			
//			while(true) {
//				message = br.readLine();
//				
//				if(message == null) {
//					System.out.println("SERVER : 접속 종료");
//					break;
//				}
//				
//				System.out.println("SERVER : [수신 메시지] : " + message);
//				
//				// Echo Back 메시지 전송
//				message = "Echo Back - " + message;
//				System.out.println("SERVER : [ECHO Back] : " + message);
//				bw.write(message);
//				bw.newLine();
//				bw.flush();
//			}
//			
//			bw.close();
//			br.close();
			// ----- Working Thread Logic End
			
			// 후처리
			// System.out.println("SERVER : [서버 종료]");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				serverSocket.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
