package network;

import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class TCPClientMain {
//클라이언트
	public static void main(String[] args) {
		
		try {
			InetAddress addr = InetAddress.getByName("192.168.0.234");
			
			//내 IP : 192.168.0.232
			//서버에 접속
			Socket sct=new Socket(addr,9998);
			
			//전송할 메시지 입력 받기
			System.out.print("메세지: ");
			Scanner sc=new Scanner(System.in);
			String msg=sc.nextLine();
			sc.close();
			
			//전송할 스트림 생성
			PrintWriter pw = new PrintWriter(sct.getOutputStream());
			//데이터 전송
			pw.println(msg);
			pw.flush();
			
			sct.close();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}

	}

}
