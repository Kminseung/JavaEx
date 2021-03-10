package com.javaex.io.bytestream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataStreamEx {
	// 바이트 기반 스트림은 기본 데이터 타입을 저장할 수 없음
	// DataInputStream, DataOutputStream을 이용하여 기본 타입을 변환 저장
	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	static final String filename = rootPath + "primitive.txt";
	
	public static void main(String[] args) {
		// exportPrimitives();
		importPrimitives();
	}

	private static void exportPrimitives() {
		// 메인 스트림
		OutputStream os = null;
		
		// 보조 스트림
		DataOutputStream dos = null;
		
		try {
			os = new FileOutputStream(filename);
			dos = new DataOutputStream(os);
			
			// 기본 타입 출력
			dos.writeUTF("홍길동");
			dos.writeBoolean(true);;
			dos.writeInt(25);
			dos.writeFloat(80.3f);
			
			dos.writeUTF("김길동");
			dos.writeBoolean(false);
			dos.writeInt(30);
			dos.writeFloat(99.9f);
			
			System.out.println("데이터 출력 완료!");
		}
		catch(IOException e) {
			
		}
		finally {
			try {
				dos.close();
			}
			catch(Exception e) {
				
			}
		}
	}
	
	private static void importPrimitives() {
		// 메인 스트림
		InputStream is = null;
		
		// 보조 스트림
		DataInputStream dis = null;
		
		try {
			is = new FileInputStream(filename);
			dis = new DataInputStream(is);
			
			for(int i=0; i<2; i++) {
				// 출력한 순서대로 타입을 불러와야 함
				String s = dis.readUTF();
				boolean b = dis.readBoolean();
				int val = dis.readInt();
				float f = dis.readFloat();
				
				System.out.printf("%s %b %d %f%n", s, b, val, f);
			}
		}
		catch(FileNotFoundException e) {
			System.err.println("파일 탐색 실패");
		}
		catch(IOException e) {
			
		}
		finally {
			try {
				dis.close();
			}
			catch(Exception e) {
				
			}
		}
	}
}
