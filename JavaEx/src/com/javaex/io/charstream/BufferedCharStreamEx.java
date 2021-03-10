package com.javaex.io.charstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class BufferedCharStreamEx {

	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	static final String source = rootPath + "last-leaf.txt";
	static final String target = rootPath + "last-leaf-filtered.txt";
	
	public static void main(String[] args) {
		// 메인 스트림
		Reader reader = null;
		Writer writer = null;
		
		// 보조 스트림
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			reader = new FileReader(source);
			writer = new FileWriter(target);
			
			br = new BufferedReader(reader);
			bw = new BufferedWriter(writer);
			
			// 편의 기능으로 한 줄 단위 입출력
			String line = null;
				
			while((line=br.readLine()) != null) {
				// 읽어들인 라인 중 leaf, leaves 단어가 포함된 라인만 출력
				if(line.toLowerCase().contains("leaf") || line.toLowerCase().contains("leaves")) {
					System.out.println(line);
					bw.write(line);
					bw.newLine();
				}
			}
			System.out.println("필터링 완료");
		}
		catch(FileNotFoundException e) {
			System.err.println("파일 탐색 실패");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				br.close();
				bw.close();
			}
			catch(Exception e) {
				
			}
		}
	}

}
