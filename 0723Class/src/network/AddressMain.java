package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class AddressMain {

	public static void main(String[] args) {
		
		try {
			InetAddress addr = InetAddress.getByName("www.choongang.co.kr");
			System.out.println(addr);
			
			System.out.println("==============================");
			InetAddress[] addr1 = InetAddress.getAllByName("www.naver.com");
			for(InetAddress tmp : addr1) {
				System.out.println(tmp);
			}
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
