package bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamMain {

	public static void main(String[] args) {
	
		//파일에 바이트 단위로 기록할 수 있는 스트림 변수 생성
		FileOutputStream fos=null;
	
		//try-catch-finally는 각각의 블럭
		try {//예외가 발생할 가능성이 있는 구문
			
			//fos=new FileOutputStream("./0720byte.txt"); // 파일이 없으니까 옆에 처럼 만들고 싶은 파일 이름을 적는다. ./ : 붙이면 현재 디렉토리
			//fos=new FileOutputStream("C:\\Users\\503-02\\Pictures\\0720byte.txt"); // 저장하고 싶은 디렉토리
			fos=new FileOutputStream("C:\\Users\\503-02\\Pictures\\0720byte.txt", true); // true를 썻을 때, 한번 파일이 생성된 뒤 뒤에 이어서 문자를 추가할 수 있다.
			
			//파일에 1바이트 기록
			fos.write(97); // a가 입력됨
			fos.write('b');
			
			//파일에 바이트 배열을 기록
			byte[] ar= {' ',97, 98, 99, 100, 101};
			fos.write(ar);
			
			//문자열을 바이트 배열로 변환해서 기록
			//getBytes 이용 - 중요
			String str="Hello ";
			fos.write(str.getBytes());
			
			
			
			
			
			//버퍼에 내용 비우기
			fos.flush();
			
		}catch(Exception e) { // 예외가 발생했을 때 수행할 구문
			
			System.out.println("파일 입출력 예외 :" + e.getMessage());
			// 현재 날짜와 시간 그리고 예외 내용을 로깅한다.
			// 파일에 기록하거나 네트워크를 통해서 서버에 전달한다.
			
		}finally {
			//예외 발생 여부에 상관없이 수행할 구문
			try {
				if(fos!= null) {
					fos.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

		
		FileInputStream fis=null;
		try {
			
			fis = new FileInputStream("C:\\Users\\503-02\\Pictures\\0720byte.txt");
			
			//1바이트 읽어오기
			int r = fis.read();
			System.out.println((char)r);
			
			
			//4바이트를 읽어오기
			byte[] b=new byte[4];
			fis.read(b);
			//배열은 toString이 재정의 되어 있지 않아서 해시코드로 출력 따라서 new String으로 재정의
			System.out.println(new String(b));
			
			
			//4바이트씩 전체 읽어오기
			//read에 바이트 배열을 대입하면 읽은 개수를 리턴
			//0보다 작거나 같은 값을 리턴하면 읽을 데이터가 없다.
			while(true) {
				byte[] bb=new byte[100];
				int rr = fis.read(bb);
				//배열은 toString이 재정의 되어 있지 않아서 해시코드로 출력
				
				System.out.println(new String(bb));
				if(rr<=0) {
					break;
				}
				
			}
			
			
			
			
			
		}catch(Exception e) {
			
			System.out.println("파일 읽기 예외:" + e.getMessage());
			
		}finally {
			
			try {
				if(fis!=null) {
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
