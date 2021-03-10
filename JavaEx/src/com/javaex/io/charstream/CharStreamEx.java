package com.javaex.io.charstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class CharStreamEx {

	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	static final String filename = rootPath + "myFile.txt";
	public static void main(String[] args) {
		// writeTextEx();
		readTextEx();
	}

	private static void writeTextEx() {
		Writer writer = null;
		
		try {
			writer = new FileWriter(filename);
			
			System.out.println("파일 열기");
			writer.write("Bit Computer\r\n");
			writer.write("Java Programming\r\n");
			writer.write("2021. 03");
			System.out.println("파일 기록");
			
			//내부 버퍼 비우기
			writer.flush();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				writer.close();
			}
			catch(Exception e) {
				
			}
		}
	}
	
	private static void readTextEx() {
		Reader reader = null;
		
		try {
			reader = new FileReader(filename);
			
			int data = 0;		// int(4) -> char(2)
			while((data=reader.read()) != -1) {
				System.out.print((char)data);
			}
			System.out.println();
		}
		catch(FileNotFoundException e) {
			System.err.println("파일 탐색 실패");
		}
		catch(IOException e) {
			
		}
		finally {
			try {
				reader.close();
			}
			catch(Exception e) {
				
			}
		}
	}
}
