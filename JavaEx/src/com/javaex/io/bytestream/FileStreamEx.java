package com.javaex.io.bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileStreamEx {

	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	static final String source = rootPath + "img.jpg";
	static final String target = rootPath + "img_copy.jpg";
	
	public static void main(String[] args) {
		InputStream is = null;
		OutputStream os = null;
		
		try {
			is = new FileInputStream(source);
			os = new FileOutputStream(target);
			
			int data = 0;		// 1byte 읽고 int형으로 변환
			
			System.out.println("복사 시작...");
			while((data = is.read()) != -1) {
				os.write(data);
			}
			System.out.println("복사 종료...");
		}
		catch(FileNotFoundException e) {
			System.err.println("파일 탐색 실패!");
		}
		catch(IOException e) {
			System.err.println("복사 실패!");
		}
		finally {
			try {
				os.close();
				is.close();
			}
			catch(Exception e) {
				
			}
		}
	}

}
