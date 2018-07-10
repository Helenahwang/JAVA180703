package wrapper;

import java.io.IOException;

public class Systemtest {

	public static void main(String[] args) {
		
		long one=System.currentTimeMillis();
		
		/*
		for(int i=0; i<1000000; i++) {
			
			System.out.println("Hello World");
		
		}
		
		*/
		long two=System.currentTimeMillis();
		
		System.out.println((two-one)/1000.0);
		
		//환경변수 확인
		System.out.println(System.getenv("path")); //명령어만 입력해도 실행될 수 있도록 하는 경로 
		
		//시스템 속성 확인
		System.out.println(System.getProperty("java.version"));
		
		Runtime r = Runtime.getRuntime();
		try {
			r.exec("notepad.exe"); //메모장 열기
			r.exec("notepad.exe C:\\Users\\503-02\\Documents\\황연하\\0702.txt"); //7월 2일 메모장 열기
			r.exec("C:\\Program Files (x86)\\Microsoft Office\\Office12\\EXCEL.EXE"); //엑셀 열기
			r.exec("mspaint.exe C:\\Users\\503-02\\Pictures\\cake.jpg"); //Paint프로그램으로 사진 열기
			r.exec("C:\\Program Files (x86)\\Internet Explorer\\iexplore.exe www.google.com"); //google 열기
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
