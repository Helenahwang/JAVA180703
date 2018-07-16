package thread;

public class ThreadEx1 extends Thread {

	//스레드로 동작할 메소드
	public void run() {
		//1초마다 Thread라는 글자를 10번 출력
		int i=0;
		while(i<10) {
			System.out.println("Thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				System.out.println("스레드 종료");
				//스레드를 강제 종료 할 수 있도록 예외가 발생하면 run 메소드 종료
				return; //항상 return을 넣어라!
				
				//System.out.println(e.getMessage());
				//e.printStackTrace();
			}
			i++;
		}
	}
	
}
