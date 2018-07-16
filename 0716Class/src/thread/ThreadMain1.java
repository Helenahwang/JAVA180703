package thread;

public class ThreadMain1 {

	public static void main(String[] args) {
		
		ThreadEx1 th=new ThreadEx1();
		//데몬 스레드 설정
		th.setDaemon(true); //다른 작업이 없으면 기존의 작업이 멈춘다.
		//스레드 시작
		th.start();
		
		
		try {
			Thread.sleep(2000);
			//2초후에 InterruptedException을 발생시킨다.
			th.interrupt();

			
			//3초후 종료
			Thread.sleep(3000);
			System.out.println("메인 종료");
			//프로그램 종료
			//System.exit(0);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
