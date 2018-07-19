package file;

import java.io.File;
import java.sql.Date;


public class Main {

	public static void main(String[] args) {
		
		//파일에 대한 정보를 확인할 수 있는 클래스의 인스턴스를 생성
		File f = new File("C:\\Users\\503-02\\Documents\\황연하\\Session3\\JAVA_박문석\\16.IO.pptx");
		
		//파일의 존재 여부
		System.out.println(f.exists());
		
		//파일의 크기
		long size=f.length();
		System.out.println(size/1024+"K bytes");
		
		//파일의 최후 수정시간
		System.out.println(f.lastModified()); 
		
		//위의 처럼하면 몇월 며칠인지 모른다. 따라서 Date 클래스 이용
		Date d=new Date(f.lastModified());
		System.out.println(d);
		

		File file = new File("C:\\Users\\503-02\\Documents\\황연하\\Session3\\JAVA_박문석\\16.IO.pptx");
		String parent = file.getParent();
		String filename = file.getName();
		
		//filename에서 16.을 제거한 부분 가져오기
		
		String fname=file.getName();
		int idx = fname.indexOf('.');
		//.이 존재한다면 : 위치를 찾는 메소드를... 없다면 : 음수를 리턴
		if(idx>=0) {
			//문자를 가지고 자를 때는  => split 메소드 이용
			//문자열을 위치를 가지고 자르는 메소드 subString
			fname=fname.substring(idx+1); // idx+1 이 위치부터 끝까지 나온다. (A,B) A부터 B앞까지만 나온다.
		}
		System.out.println(fname);
		
		//이름 바꾸기 
		file.renameTo(new File(fname));
		
		
		
	}

}
