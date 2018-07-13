package mutex;

public class Main1 {

	public static void main(String[] args) {
		
		Mutex mu=new Mutex();
		Thread th=new Thread(mu);
		th.start();
		
		int sum=0;
		for(int i=1; i<=20000; i++) {
			sum=sum+i;
		}
		System.out.println(sum);
		
		
		Thread th1=new Thread(mu);
		th1.start();
		
		
		//25초후 값 확인
		
		try {
			Thread.sleep(25000);
			System.out.println(mu.getResult());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
