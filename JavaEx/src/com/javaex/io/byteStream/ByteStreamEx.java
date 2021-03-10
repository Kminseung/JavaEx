package com.javaex.io.byteStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class ByteStreamEx {

	public static void main(String[] args) {
		// 입력 소스
		byte input[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		// 목적지
		byte output[] = null;
		
		System.out.println("원본 : " + Arrays.toString(input));
		// 스트림 열기
		InputStream bis = null;
		OutputStream bos = null;
		
		try {
			bis = new ByteArrayInputStream(input);
			bos = new ByteArrayOutputStream();
			
			int data = 0;
			
			while(data != -1) {
				data = bis.read();	// 1바이트를 읽어옴
				System.out.println("읽은 데이터 : " + data);
				
				// OutputStream으로 출력
				bos.write(data);
			}
			
			// 타겟 배열로 출력
			output = ((ByteArrayOutputStream)bos).toByteArray();
			System.out.println("출력 : " + Arrays.toString(output));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
//			if(bos != null)
//				bos.close();
//			if(bis != null)
//				bis.close();
			try {
				bos.close();
				bis.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
