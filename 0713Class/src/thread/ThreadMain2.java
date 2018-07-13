package thread;

public class ThreadMain2 {

	public static void main(String[] args) {
		
		Threadex2 thr = new Threadex2();
		thr.start(); // 이렇게 써야 Thread 사용할 수 있다.
		
		System.out.println("정말 스레드?");

	}

}
