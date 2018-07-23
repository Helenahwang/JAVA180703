package io;

import java.io.PrintWriter;

public class PrintWriterMain {

	public static void main(String[] args) {
		
		//파일, 네트워크, 데이터 베이스 관련 클래스들은 예외처리를 강제한다.
		PrintWriter pw = null;
		
		try {
			//현재 디렉토리에 파일을 생성
			pw=new PrintWriter("./file.txt");
			pw.println("안녕하세요. 반갑습니다.");
			pw.flush();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if(pw != null) {
				pw.close();
			}
			
		}
	}

}
