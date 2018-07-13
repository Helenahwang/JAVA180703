package thread;

import java.util.Random;

public class Threadex2 extends Thread {
	//스레드로 수행할 내용을 작성하는 메소드
	public void run() {
		
		//빨강, 파랑, 노랑은 랜덤하게 1초마다 출력하기
		String[] color = {"빨강", "파랑", "노랑"};
		
		//랜덤을 만들어주는 클래스의 인스턴스 만들기
		Random rd=new Random();
		//무한반복
		while(true) {
			System.out.println(color[rd.nextInt(color.length)]);
			try {
				Thread.sleep(1000); //1초마다 쉰다.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
}
