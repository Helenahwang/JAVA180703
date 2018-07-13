package thread;

public class ThreadMain4 {

	public static void main(String[] args) {
		
		
		
		ThreadEx4 thr=new ThreadEx4("지수");
		Thread th=new Thread(thr);

		
		ThreadEx4 thr1=new ThreadEx4("제니");
		Thread th1=new Thread(thr1);

		
		
		ThreadEx4 thr2=new ThreadEx4("리사");
		ThreadEx4 thr3=new ThreadEx4("리제");
		
		
		Thread th2=new Thread(thr2);
		Thread th3=new Thread(thr3);
		
		
		//스레드의 우선 순위 변경
		th1.setPriority(Thread.MAX_PRIORITY);
		th.setPriority(Thread.MIN_PRIORITY);
		
		th.start();
		th1.start();
		th2.start();
		th3.start();
		
		
		try {
			Thread.sleep(3000);
			th1.interrupt(); //이렇게만 써서는 강제 종료가 되지 않는다. run( )메소드 안에 catch(InterruptedException e){ }에 return을 꼭 써줘야 한다.
			th2.interrupt();
			th3.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
