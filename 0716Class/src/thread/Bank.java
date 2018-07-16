package thread;

public class Bank {

	//잔액을 저장할 변수
	private int balance = 1000;
	
	//잔액을 변경하는 메소드
	public void job(String msg) {
		
		synchronized (this) {
			System.out.println(msg+" 현재 잔액: "+balance);
			balance = balance - 100;
		}
		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(msg + " 작업 후 현재 잔액: "+balance);
	}

	private void Synchronized(Bank bank) {
		// TODO Auto-generated method stub
		
	}
	
}
