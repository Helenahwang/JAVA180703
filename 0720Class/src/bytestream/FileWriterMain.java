package bytestream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterMain {

	public static void main(String[] args) {

		FileWriter fw=null;

		try {

			fw=new FileWriter("./char.txt");
			fw.write("안녕하세요");
			fw.write("반갑습니다.\n");
			fw.write("안녕하세요. 반갑습니다. 문자열을 기록하고 있습니다.");
			fw.flush();

		}catch(Exception e) {

		}finally {
			try {
				fw.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}



		FileReader fr=null;
		try {
			fr= new FileReader("C:\\Users\\503-02\\Pictures\\0720byte.txt");

			char[] buf = new char[5]; // 10개의 character을 읽어오기. 계속 읽어오려면 반복문 안에서 배열을 만들어주어야 한다.

	
				fr.read(buf);
				System.out.println(buf);

				
			char[] buf1 = new char[30];
			while(true) {
				int r = fr.read(buf1);
				if(r <= 0) {
					break;
				}
				
				System.out.println(new String(buf1,0,r));// 배열에서 0번째 부터 r만큼 만 문자열로 변환해서 출력
			}

			

		}catch(Exception e) {
			System.out.println("예외:"+e.getMessage());
		}finally {
			try {
				if(fr!=null) {
					fr.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}










}

