package broadcast;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class BroadCastSender {

	public static void main(String[] args) {
		
		try {
			//UDP 전송을 위한 소켓 생성
			DatagramSocket ds = new DatagramSocket();
			
			//스캐너 이용해서 닉네임 입력
			Scanner sc = new Scanner(System.in);
			System.out.println("닉네임 입력 : ");
			
			String nick =sc.nextLine();
			
			String msg = nick + "님이 전송할 준비가 되었습니다.";
			
			DatagramPacket dp = new DatagramPacket(msg.getBytes(),msg.getBytes().length, InetAddress.getByName("192.168.0.255"),7777); //192.168.0까지 같아야 모든 메시지를 주고 받을 수 있다.
			ds.send(dp);
			
			while(true) {
				System.out.print("메시지: ");
				msg = sc.nextLine();
				msg = nick + ":" +msg;
				
				dp = new DatagramPacket(msg.getBytes(),msg.getBytes().length, InetAddress.getByName("192.168.0.255"),7777); //192.168.0까지 같아야 모든 메시지를 주고 받을 수 있다.
				ds.send(dp);
	
			}
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
