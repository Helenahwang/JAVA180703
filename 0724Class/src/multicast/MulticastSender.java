package multicast;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.Scanner;

public class MulticastSender {

	public static void main(String[] args) {

		try {
			//보내는 멀티캐스트 소켓을 생성
			MulticastSocket ms = new MulticastSocket();

			//문자열을 입력받기 위한 스캐너 만들기
			Scanner sc = new Scanner(System.in);

			//닉네임 설정하기
			System.out.print("닉네임 입력: ");
			String nick = sc.nextLine();
			String str = nick + "님이 입장하셨습니다.";
			
			//보내는 패킷 만들기 - 내용, 길이, 공통으로 받을 곳의 주소, 포트 번호
			DatagramPacket dpstr = new DatagramPacket(str.getBytes(),str.getBytes().length, InetAddress.getByName("230.100.50.5"), 9999);

			//데이터 전송
			ms.send(dpstr);
			
			

			while(true) {
				System.out.print("메세지(종료는 end):");
				String msg = sc.nextLine();
				
				if(msg.equals("end")) {
					msg = nick+"님이 퇴장하셨습니다.";

					//보내는 패킷 만들기 - 내용, 길이, 공통으로 받을 곳의 주소, 포트 번호
					DatagramPacket dp = new DatagramPacket(msg.getBytes(),msg.getBytes().length, InetAddress.getByName("230.100.50.5"), 9999);

					//데이터 전송
					ms.send(dp);

					//소켓과 스캐너 닫기
					ms.close();
					sc.close();
					break;
				}
				
				msg=nick+ " : " +msg;
				
				//보내는 패킷 만들기 - 내용, 길이, 공통으로 받을 곳의 주소, 포트 번호
				DatagramPacket dp = new DatagramPacket(msg.getBytes(),msg.getBytes().length, InetAddress.getByName("230.100.50.5"), 9999);

				//데이터 전송
				ms.send(dp);
				
			}


		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
