package network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

//서버소켓

public class ServerSocketMain {

	public static void main(String[] args) {
		
		try {
			//서버 소켓 생성
			ServerSocket ss = new ServerSocket(9999); // 포트번호를 적는다.
			while(true) {
				System.out.println("서버 대기 중...");
				//클라이언트 접속 대기 - 클라이언트가 접속하면 클라이언트와의 통신을 위한 Socket을 리턴하고 다음 줄의 코드 실행
				Socket sk=ss.accept();
				//한 줄의 데이터를 읽어서 출력
				BufferedReader br = new BufferedReader(new InputStreamReader(sk.getInputStream()));
				String msg=br.readLine();
				System.out.println("메시지: "+msg);
				System.out.println("접속자:"+sk.getInetAddress());
				br.close();
				sk.close();
			}
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			
		}
	}

}
