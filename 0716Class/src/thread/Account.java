package thread;

public class Account {

	private int balance;
	
	//잔액을 추가하는 메소드
	public synchronized void save() {
		//synchronized(this) {
		System.out.println("작업 전 잔액: " + balance);
		balance = balance + 1000;
		
		notify();
		
		//}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("작업 후 잔액: "+balance);
	}
	
	//잔액을 감소시키는 메소드
	public synchronized void withdraw() {
		if(balance < 1000){
			try {
				//notify()를 호출할 때까지 대기
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("작업 전 잔액: " + balance);
		balance = balance - 1000;
		//}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("작업 후 잔액: "+balance);
		
	}
	
}
