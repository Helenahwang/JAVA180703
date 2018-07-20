package bytestream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamMain{

	public static void main(String[] args) {
		
		PrintStream ps = null;
		try {
			
			//ps=new PrintStream(new FileOutputStream("./data.dat")); // .dat : 텍스트 파일
			ps=new PrintStream(new FileOutputStream("./data.dat",true)); // 있던 파일 안에서 이어쓰기
			ps.println("반갑습니다.");
			ps.println("바로 바로 처리합니다.");
			ps.flush();
			
			
		}catch(Exception e){
			System.out.println("파일쓰기 예외:"+e.getMessage());
		}finally {
			try {
				if(ps!=null) {
				ps.close();
				}
			} catch(Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
