package etc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {
		
		//키보드로부터 한 줄을 입력받아서 출력
		Scanner sc=new Scanner(System.in);
		
		System.out.println("이름 입력 : ");
		
		//한 줄을 입력받는 객체
		String msg = sc.nextLine();
		
		//String msg=sc.next(); //중간에 공백이 있으면 끝난 걸로 간주
		
		System.out.println(msg);
		
		//스캐너를 사용하면 마지막에 닫아  주어야 한다.
		sc.close();
		
		//문자열로 부터 받기
		sc=new Scanner("Hello Java");
		System.out.println(sc.next());
		System.out.println(sc.next());
		
		sc.close();
		
		//File 객체 만들기
		//File f = new File("C:\\JavaProgramming\\source\\Sample\\src\\Coffee.java");
		
		File f = new File("C:\\Users\\503-02\\Documents\\황연하\\TEST.txt"); //파일 인코딩을 UTF-8로 해서 저장해야 읽힌다.
		//파일과 연결되는 스캐너 객체 만들기
		try {
			sc=new Scanner(f);
			//데이터가 있을 때 까지 읽기
			//파일이 있는데 내용을 못읽는 경우는 2가지 경우 인데
			//구분 문자가 없는 경우이고 한글 인코딩이 서로 다른 경우이다.
			//한글 인코딩이 잘못되면 글자가 깨지는 것이 아니라 scanner가 읽지 못한다.
			//공백 문자를 찾아야 하는데 인코딩이 다르면 공백 문자의 코드 값이 다르다.
			
			
			
			while(sc.hasNext()) {
				System.out.println(sc.next());
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
