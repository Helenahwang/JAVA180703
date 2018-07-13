package thread;

public class ThreadMain3 {

	public static void main(String[] args) {
		//Runnable 인터페이스 implements 한 클래스를 이용해서 스레드 시작
		ThreadEx3 thr=new ThreadEx3(); //Runable에는 start 메소드가 없다 따라서 Thread 클래스가 필요하다.
		Thread th = new Thread(thr);
		th.start();

	}

}
