package thread;

public class ThreadMain {

	public static void main(String[] args) {
		//앞에서 만든 클래스의 인스턴스를 만들고 run 메소드를 호출
		/*
		Threadex1 thr = new Threadex1();
		thr.run();
		
		Threadex1 thr1 = new Threadex1();
		thr1.run();
		*/

		
		//스레드로 실행

		ThreadEx1 thr2 = new ThreadEx1();
		thr2.setDaemon(true);//보통때는 일을 안한다. 하지만 다른 것이 일을 시작하게 되면 일을 하기 시작하다가 다른 일이 종료되면 같이 종료된다.
		thr2.start();
		
		ThreadEx1 thr3 = new ThreadEx1();
		thr3.setDaemon(true); //보통때는 일을 안한다. 하지만 다른 것이 일을 시작하게 되면 일을 하기 시작하다가 다른 일이 종료되면 같이 종료된다.
		thr3.start();
		

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("메인 종료");
		
	}

}
