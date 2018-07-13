package thread;

public class ThreadEx4 implements Runnable {

	private String name;
	
	
	public ThreadEx4(String name) {
		this.name=name;
	}
	
	
	@Override
	public void run() {
		
		for(int i=0; i<10; i++) {
			System.out.println(name);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("스레드 종료");
				return;
			}
		}

	}

}
